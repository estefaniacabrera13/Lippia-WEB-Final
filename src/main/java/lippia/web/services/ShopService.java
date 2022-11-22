package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.HomePageConstants;
import lippia.web.constants.ShopConstants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ShopService extends ActionManager{
    public static void addToBasket(){
        getElement(ShopConstants.ADD_TO_BASKET_BUTTON);
        click(ShopConstants.ADD_TO_BASKET_BUTTON);
    }
    public static void validateTax(){
        WebElement subtotal = getElement(HomePageConstants.SUBTOTAL_AMOUNT_VALUE);
        WebElement totalTax = getElement(HomePageConstants.TAX_AMOUNT_VALUE);
        double Subtotal = Double.parseDouble(subtotal.getText().substring(1));
        double TotalTax = Double.parseDouble(totalTax.getText().substring(1));
        int porcentaje = (int) (TotalTax / Subtotal)/100;
        System.out.println(porcentaje);
        if (porcentaje == 0.02){
            System.out.println("Tiene impuestos de India");
        }
        else if(porcentaje == 0.05){
            System.out.println("Tiene impuestos extranjeros");
        }else {
            System.out.println("Revisar impuestos");
        }
    }

}
