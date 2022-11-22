package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.util.MapUtils;
import lippia.web.constants.HomePageConstants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;
import java.util.Map;


public class HomePageService extends ActionManager {
    public static void sliderVerification() {
        List<WebElement> sliders = getElementsByParent(HomePageConstants.SLICER_DIV, HomePageConstants.IMG_SLICER);
        Assert.assertEquals(3, sliders.size());
    }

    public static void arrivalsVerification() {
        List<WebElement> imagenes = getElementsByParent(HomePageConstants.ARRIVALS_DIV, HomePageConstants.IMG_ARRIVALS);
        Assert.assertEquals(3, imagenes.size());
    }

    public static void clickImageArrival(String image) {
        String seleccionImage = image;
        switch (seleccionImage) {
            case "Selenium Ruby":
                click(HomePageConstants.SELENIUM_BOOK);
                break;
            case "Thinking in HTML":
                click(HomePageConstants.HTML_BOOK);
                break;
            case "Mastering Javascript":
                click(HomePageConstants.JAVASCRIPT_BOOK);
                break;
            default:
                System.out.println("No se puede clickear en el libro " + seleccionImage);
                break;
        }
    }
    public static void clickAddToBasket() {
        click(HomePageConstants.ADD_TO_CART_BUTTON);
    }
    public static void clickAmountLink() {
        click(HomePageConstants.AMOUNT_LINK_MENU);
    }

    public static void validatePrices() {
        WebElement subtotal = getElement(HomePageConstants.SUBTOTAL_AMOUNT_VALUE);
        WebElement total = getElement(HomePageConstants.TOTAL_AMOUNT_VALUE);
        double Subtotal = Double.parseDouble(subtotal.getText().substring(1));
        double Total = Double.parseDouble(total.getText().substring(1));
        Assert.assertTrue(Subtotal < Total, "El subtotal no es menor al total");

    }
    public static void clickProceedCheckOut() {
        ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("window.scrollBy(0,250)");
        click(HomePageConstants.PROCEED_CHECK_OUT_BUTTON);

    }

    public static void verifyCheckOutData() {
        waitVisibility(HomePageConstants.BILLING_DETAILS_HEADER_FORM);
        Assert.assertTrue(isVisible(HomePageConstants.BILLING_DETAILS_HEADER_FORM));
        Assert.assertTrue(isVisible(HomePageConstants.YOUR_ORDER_HEADER));
        Assert.assertTrue(isVisible(HomePageConstants.PAYMENT_METHOD_DIV));
        Assert.assertTrue(isVisible(HomePageConstants.ADDITIONAL_INFORMATION_HEADER));
    }
    public static void completeBillingForm(String details) {
        Actions action = new Actions(DriverManager.getDriverInstance());
        Map<String, String> information = MapUtils.splitIntoMap(details, ",", ":");
        setInput(HomePageConstants.FIRST_NAME_INPUT, information.get("FirstName"));
        setInput(HomePageConstants.LAST_NAME_INPUT, information.get("LastName"));
        setInput(HomePageConstants.COMPANY_NAME_INPUT, information.get("CompanyName"));
        setInput(HomePageConstants.EMIAL_INPUT, information.get("EmailAddress"));
        setInput(HomePageConstants.PHONE_INPUT, information.get("Phone"));
        setInput(HomePageConstants.ADRESS_INPUT, information.get("Address"));
        setInput(HomePageConstants.APARTMENT_INPUT, information.get("Apartment"));
        setInput(HomePageConstants.TOWN_INPUT, information.get("Town"));
        setInput(HomePageConstants.POSTCODE_INPUT, information.get("Postcode"));
        //Country
        setInput(HomePageConstants.COUNTRY_INPUT, information.get("Country"));
        String country = information.get("Country");
        switch (country){
            case "India":
                click(HomePageConstants.COUNTRY_INDIA);
                break;
            case "Argentina":
                click(HomePageConstants.COUNTRY_ARGENTINA);
                break;
        }

        //State
        setInput(HomePageConstants.STATE_INPUT, information.get("State"));
        String state = information.get("Country");
        switch (state){
            case "Andhra Pradesh":
                click(HomePageConstants.STATE_INDIA);
                break;
            case "Buenos Aires":
                click(HomePageConstants.STATE_ARGENTINA);
                break;
        }
    }

    public static void selectPaymentMethod(String method) {
        Actions action = new Actions(DriverManager.getDriverInstance());
        String selectPayment = method;
        switch (selectPayment) {
            case "Direct Bank Transfer":
                WebElement element1 = getElement(HomePageConstants.PAYMENT_METHOD_INPUT + "payment_method_bacs");
                action.moveToElement(element1).click();
                break;
            case "Check Payments":
                WebElement element2 = getElement(HomePageConstants.PAYMENT_METHOD_INPUT + "payment_method_cheque");
                action.moveToElement(element2).click();
                break;
            case "Cash on Delivery":
                WebElement element3 = getElement(HomePageConstants.PAYMENT_METHOD_INPUT + "payment_method_cod");
                action.moveToElement(element3).click();
                break;
            case " PayPal Express Checkout":
                WebElement element4 = getElement(HomePageConstants.PAYMENT_METHOD_INPUT + "payment_method_ppec_paypal");
                action.moveToElement(element4).click();
                break;
            default:
                System.out.println("No se puede clickear en " + selectPayment);
                break;
        }

    }
    public static void verifyCoupon() {
        click(HomePageConstants.COUPON_LINK_2);
        waitVisibility(HomePageConstants.COUPON_FORM);
        Assert.assertTrue(isVisible(HomePageConstants.COUPON_FORM));
    }
    public static void clickPlaceOrderButton(){
        ((JavascriptExecutor) DriverManager.getDriverInstance()).executeScript("window.scrollBy(0,document.body.scrollHeight)");
        CommonService.waitTime(2000);
        //CommonService.closeAds();
        //click(HomePageConstants.PLACE_ORDER_BUTTON);
        click(HomePageConstants.PLACE_ORDER_BUTTON);

    }
    public static void orderConfirmation(){
        Assert.assertTrue(isVisible(HomePageConstants.BANK_DETAILS_HEADER));
        Assert.assertTrue(isVisible(HomePageConstants.ORDER_DETAILS_HEADER));
        Assert.assertTrue(isVisible(HomePageConstants.CUSTOMER_DETAILS_HEADER));
        Assert.assertTrue(isVisible(HomePageConstants.BILLING_DETAILS_HEADER));

    }

}
