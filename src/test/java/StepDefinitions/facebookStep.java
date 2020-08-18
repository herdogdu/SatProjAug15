package StepDefinitions;

import POMS.FacebookPage;
import Utils.BaseDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class facebookStep {
    WebDriver driver = BaseDriver.getDriver();
    FacebookPage facebookPage = new FacebookPage();

    @Given("^Navigate to \"([^\"]*)\"$")
    public void navigate_to(String website) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver = BaseDriver.getDriver();
        driver.get(website);
        driver.manage().window().maximize();
    }

    @When("^Click Sign in button$")
    public void click_Sign_in_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        facebookPage.findElmAndClick("signIn");
    }

    @Then("^Enter \"([^\"]*)\" as email and \"([^\"]*)\" as password$")
    public void enter_as_email_and_as_password(String email, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        facebookPage.findElmAndSendKeys("userName", email);
        facebookPage.findElmAndSendKeys("password", password);
    }

    @Then("^Click Submit Button$")
    public void click_Submit_Button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        facebookPage.findElmAndClick("submit");
    }

    @Then("^Click on \"([^\"]*)\" on the right bottom corner$")
    public void click_on_on_the_right_bottom_corner(String socialMediaIcon) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        facebookPage.findElmAndClick(socialMediaIcon);

    }

    @And("^Verify that URL contains \"([^\"]*)\"$")
    public void verifyThatURLContains(String socialMedia) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        facebookPage.verifyURLFunction(socialMedia);
    }
}
