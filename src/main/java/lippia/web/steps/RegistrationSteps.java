package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lippia.web.services.LogInService;
import com.crowdar.core.PageSteps;
import lippia.web.services.RegistrationService;

public class RegistrationSteps extends PageSteps {

    @And("^Enter the username (.*) in the registration email textbox$")
    public void enterTheUsernameUsernameInTheRegistrationEmailTextbox(String username) {
        RegistrationService.enterUserNameRegistration(username);
    }
    @And("^Enter the password (.*) in the registration password textbox$")
    public void enterThePasswordPasswordInTheRegistrationPasswordTextbox(String password) {
        RegistrationService.enterPasswordRegistration(password);
    }

    @And("Click on Register button")
    public void clickOnRegisterButton() {
        RegistrationService.clickRegistrationButton();
    }

    @Then("^Registration must fail with a warning message (.*)$")
    public void registrationMustFailWithAWarningMessageWarning(String warning) {
        RegistrationService.RegisterError(warning);
    }
}
