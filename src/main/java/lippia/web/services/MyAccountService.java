package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LogInConstants;
import lippia.web.constants.MyAccountConstants;
import org.testng.Assert;

public class MyAccountService extends ActionManager {
    public static void clickLogout() {
        waitVisibility(MyAccountConstants.LOGOUT_BUTTON);
        click(MyAccountConstants.LOGOUT_BUTTON);
    }

    public static void clickAccount(){
        waitVisibility(MyAccountConstants.ACCOUNT_LINK);
        click(MyAccountConstants.ACCOUNT_LINK);
    }
    public static void validateAccountDetails(){
        Assert.assertTrue(isVisible(MyAccountConstants.ACCOUNT_DETAILS_FORM));
        Assert.assertTrue(isVisible(MyAccountConstants.PASSWORD_CHANGE_FORM));
    }
}
