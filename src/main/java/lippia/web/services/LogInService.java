package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.LogInConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LogInService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }
    public static void clickMyAccount() {
        click(LogInConstants.MY_ACCOUNT_BUTTON);
    }
    public static void enterUserName(String text) {
        setInput(LogInConstants.USERNAME_INPUT, text);
    }
    public static void enterPassWord(String text) {
        setInput(LogInConstants.PASSWORD_INPUT, text);}

    public static void clickLogin() {

        click(LogInConstants.LOGIN_BUTTON);
    }
    public static void LoginPage() {
        Assert.assertTrue(isVisible(LogInConstants.LOGIN_DESCRIPTION));
    }

    public static void LoginErrorPage(String mensaje) {
        String respuestaMensaje = getText(LogInConstants.LOGIN_ERROR_DESCRIPTION);
        Assert.assertEquals(mensaje, respuestaMensaje);
    }
    public static void clickBackButton(){
        DriverManager.getDriverInstance().getWrappedDriver().navigate().back();
    }
    public static void LoginHeather() {
        Assert.assertTrue(isVisible(LogInConstants.LOGIN_HEATHER));
    }
}
