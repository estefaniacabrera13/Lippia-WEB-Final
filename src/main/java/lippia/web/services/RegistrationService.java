package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.LogInConstants;
import lippia.web.constants.RegistrationConstants;
import org.testng.Assert;

public class RegistrationService extends ActionManager {

    public static void enterUserNameRegistration(String username) {

        setInput(RegistrationConstants.USERNAME_INPUT_REGISTRATION, username);
    }
    public static void enterPasswordRegistration(String password) {

        setInput(RegistrationConstants.PASSWORD_INPUT_REGISTRATION, password);
    }
    public static void clickRegistrationButton(){
        click(RegistrationConstants.REGISTER_BUTTON);
    }
    public static void RegisterError(String warning){
        String respuestaMensaje = getText(RegistrationConstants.REGISTER_ERROR_MESSAGE);
        Assert.assertEquals(warning, respuestaMensaje);
    };

}
