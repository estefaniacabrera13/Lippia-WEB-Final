package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.HomePageConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class CommonService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }
    public static void clickHome(){
        click(HomePageConstants.HOME_BUTTON);
    }

    public static void clickShop(){
        click(HomePageConstants.SHOP_BUTTON);

    }
    public static void closeAds() {
        WebDriver driver = DriverManager.getDriverInstance();
        try {
            WebElement iframe1 = getElement(HomePageConstants.AD_IFRAME1_XPATH);
            if (iframe1.isDisplayed()) {
                driver.switchTo().frame(iframe1);
                try {
                    getElement(HomePageConstants.AD_CLOSE_BUTTON_XPATH).click();
                } catch (Exception e) {
                    WebElement iframe2 = getElement(HomePageConstants.AD_IFRAME2_XPATH);
                    driver.switchTo().frame(iframe2);
                    click(HomePageConstants.AD_CLOSE_BUTTON_XPATH);
                }
                driver.switchTo().defaultContent();
            }
        } catch (Exception e) {
            System.out.println("NO ADS!");
        }
    }
    public static void waitTime(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
