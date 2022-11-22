package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java8.Pa;
import lippia.web.services.RegistrationService;
import lippia.web.services.ShopService;

public class ShopSteps extends PageSteps {
    @And("Click on the Add To Basket button in the Book")
    public void clickOnTheAddToBasketButtonInTheSeleniumBook() {
        ShopService.addToBasket();
    }

    @Then("Validates Tax rate for indian should be 2 percent and for abroad it should be 5 percent")
    public void validatesTaxRateForIndianShouldBeAndForAbroadItShouldBe() {
        ShopService.validateTax();
    }
}
