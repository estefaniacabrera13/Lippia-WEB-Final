package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.CommonService;
import lippia.web.services.HomePageService;
import lippia.web.services.LogInService;

public class LogInSteps extends PageSteps {

    @Given("The user is placed in the practice page")
    public void theClientEnterIntoThePracticePage() {
        LogInService.navegarWeb();
    }
    @And("Click on My Account Menu")
    public void clickOnMyAccountMenu() {
        LogInService.clickMyAccount();
        CommonService.closeAds();
    }

    @And("^Enter the case changed username (.*) in the text box$")
    public void enterRegisteredUsernameUsernameInUsernameTextbox(String username) {
        LogInService.enterUserName(username);
    }
    @And("^Enter the case changed password (.*) in the text box$")
    public void enterRegisteredPasswordInPasswordTextbox(String password) {
        LogInService.enterPassWord(password);
    }

    @And("Click on login button")
    public void clickOnLoginButton() {
        LogInService.clickLogin();
    }

    @Then("User must successfully login to the web page")
    public void userMustSuccessfullyLoginToTheWebPage() {
        LogInService.LoginPage();
    }

    @Then("^Login must fail and Proper error (.*) must be displayed$")
    public void properErrorMustBeDisplayedAndPromptToEnterLoginAgain(String mensaje) {
        LogInService.LoginErrorPage(mensaje);
    }

    @And("^Enter the username (.*) in the text box$")
    public void enterTheUsernameUsernameInTheTextBox(String username) {
        LogInService.enterUserName(username);
    }

    @And("^Enter the password (.*) in the text box$")
    public void enterThePasswordPasswordInTheTextBox(String password) {
        LogInService.enterPassWord(password);
    }

    @And("Press the back button")
    public void nowPressBackButton() {
        LogInService.clickBackButton();
    }

    @Then("User shouldn’t be signed into his account")
    public void userShouldnTBeSignedIntoHisAccount() {
        LogInService.LoginHeather();
    }
}