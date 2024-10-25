package StepDefinitions;

import Pages.TraumPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class TraumStepDefs {
    WebDriver driver = DriverFactory.getDriver();
    TraumPage traumPage= new TraumPage(driver);

    @Then("Close Browser")
    public void closeBrowser() {
TraumPage.closeBrowserM();
    }

    @Given("User Opens Web Page")
    public void userOpensWebPage() {
        TraumPage.openBrowserM();
    }

    @When("puts the correct info")
    public void putsTheCorrectInfo() {
        TraumPage.clickToSignIn();
    }

    @When("Logout")
    public void logout() {
        TraumPage.clickToLogout();
    }

    @When("Checks the Main Page items")
    public void checksTheMainPageItems() {
        TraumPage.mainPageValidation();

    }

    @When("Clicks to Order now button")
    public void clicksToOrderNowButton() {
        TraumPage.ClickToOrderNow();
    }

    @When("Checks the products")
    public void checksTheProducts() {
        TraumPage.productValidations();
    }

    @When("User Clicks to about option and validates the options")
    public void userClicksToAboutOptionAndValidatesTheOptions() {
        TraumPage.clicktoAboutOption();
    }

    @When("Click Learn Menu and Validate")
    public void clickLearnMenuAndValidate() {
        TraumPage.clicktoLearnMenu();
    }

    @When("Validate Wholesale Nav Menu")
    public void validateWholesaleNavMenu() {
        TraumPage.validateWholesaleNavMenu();
    }

    @When("Scroll to Bottom of the page")
    public void scrollToBottomOfThePage() {
        TraumPage.ScrollToBottom();
    }

    @When("Validate Footer")
    public void validateFooter() {
        TraumPage.ValidateFooter();
    }
}
