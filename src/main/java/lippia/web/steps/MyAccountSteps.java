package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.CommonService;
import lippia.web.services.LogInService;
import lippia.web.services.MyAccountService;

public class MyAccountSteps {

    @And("Click on Logout button")
    public void clickOnLogoutButton() {
        MyAccountService.clickLogout();
    }

    @Then("User successfully comes out from the site and returns to login page")
    public void userSuccessfullyComesOutFromTheSiteAndReturnsToLoginPage() {
        LogInService.LoginHeather();
    }

    @And("Click on Account details")
    public void clickOnAccountLink() {
        MyAccountService.clickAccount();
        CommonService.closeAds();
    }

    @Then("User can view account details where he can change his password also")
    public void userCanViewAccountDetailsWhereHeCanChangeHisPaswordAlso() {
        MyAccountService.validateAccountDetails();
    }
}
