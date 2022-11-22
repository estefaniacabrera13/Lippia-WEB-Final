package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.CommonService;
import lippia.web.services.HomePageService;

public class HomePageSteps extends PageSteps {
    @And("Click on Home menu button")
    public void clickOnHome() {
        CommonService.clickHome();
        CommonService.closeAds();
    }

    @Then("Verifies that the home page contains only three sliders")
    public void verifiesThatTheHomePageMustContainsOnlyThreeSliders() {
        HomePageService.sliderVerification();
    }

    @Then("Verifies that the Home page contains only three Arrivals")
    public void verifiesThatTheHomePageMustContainsOnlyThreeArrivals() {
        HomePageService.arrivalsVerification();
    }

    @When("Click on Shop Menu")
    public void clickOnShopMenu() {
        CommonService.clickShop();
        CommonService.closeAds();
    }

    @And("^Click the image (.*) in the Arrivals and navigate to next page$")
    public void clickTheImageInTheArrivalsAndNavigateToNextPage(String image) {
        HomePageService.clickImageArrival(image);
    }

    @And("Click on the Add To Basket button")
    public void clickOnTheAddToBasketButton() {
        HomePageService.clickAddToBasket();
    }

    @And("Click on Item link that contains the price in the Menu")
    public void clickOnItemLinkThatContainsThePriceInTheMenu() {
        HomePageService.clickAmountLink();
    }

    @And("In the checkout page verifies the total always is higher than subtotal")
    public void inTheCheckoutPageVerifiesTheTotalAlwaysIsHighetThanSubtotal() {
        HomePageService.validatePrices();
    }

    @And("Click on Proceed to Check out button")
    public void clickOnProceedToCheckOutButton() {
        HomePageService.clickProceedCheckOut();
        CommonService.closeAds();
    }

    @And("User can view Billing Details,Order Details,Additional details and Payment gateway details")
    public void userCanViewBillingDetailsOrderDetailsAdditionalDetailsAndPaymentGatewayDetails() {
        HomePageService.verifyCheckOutData();
    }

    @And("^User can fill his details (.*) in billing details and select payment method (.*)$")
    public void fillHisDetailsDetailsInBillingDetailsAndSelectPayment(String details, String method) {
        CommonService.closeAds();
        HomePageService.completeBillingForm(details);
        HomePageService.selectPaymentMethod(method);
    }

    @And("User has the feasibility to add coupon in the payment gateway")
    public void userHasTheFeasibilityToAddCouponInThePaymentGatewayPageAndAlsoHeCanFindBillingOrderAndAdditionalDetails() {
        HomePageService.verifyCoupon();
        HomePageService.verifyCheckOutData();
    }

    @And("Click on Place Order button to complete process")
    public void clickOnPlaceOrderButtonToCompleteProcess() {
        HomePageService.clickPlaceOrderButton();
        CommonService.closeAds();
    }

    @Then("Navigates to Order confirmation page with order details,bank details,customer details and billing details")
    public void navigatesToOrderConfirmationPageWithOrderDetailsBankDetailsCustomerDetailsAndBillingDetails() {
        HomePageService.orderConfirmation();
    }
}
