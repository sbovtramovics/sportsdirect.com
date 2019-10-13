package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages_sportsdirect.RegistrationPage;
import pages_sportsdirect.LoginPage;
import pages_sportsdirect.HomePage;

import static util.Randomizes.randomEmailAddress;

public class SportsDirectSteps {
    static HomePage homePage;
    static LoginPage loginPage;
    static RegistrationPage registrationPage;
    private WebDriver driver;
    private WebDriverWait wait;

    public SportsDirectSteps() {
        this.driver = Hooks.driver;
        this.wait = Hooks.wait;
        registrationPage = PageFactory.initElements(Hooks.driver, RegistrationPage.class);
        homePage = PageFactory.initElements(Hooks.driver, HomePage.class);
        loginPage = PageFactory.initElements(Hooks.driver, LoginPage.class);
    }

    @Given("^I (?:am on|open) the home page$")
    public void iAmOnHomePage() {
        driver.get(homePage.getPageUrl());
    }

    @And("^I close pop up message$")
    public void iClosePopUpMessage() {
        wait.until(ExpectedConditions.visibilityOf(homePage.closeButton()));
        homePage.clickCloseButton();
    }

    @And("^I click Sign In button$")
    public void iClickSignInButton() {
        registrationPage.clickSignIn();
    }

    @And("^I click new user registration button$")
    public void iClickNewUserRegistrationButton() {
        loginPage.clickRegisterNewUser();
    }

    @And("^I fill the registration data with following information: \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void iFillTheRegistrationDataWithFollowingInformation(String testFirstName, String testLastName, String email, String dateOfBirth, String password) {
        if (email.equals("random"))
            email = randomEmailAddress();
        registrationPage.setRegistrationData(testFirstName, testLastName, email, password);
        registrationPage.setDateOfBirth(dateOfBirth);
    }

    @And("^I click submit registration button$")
    public void iClickSubmitRegistrationButton() {
        registrationPage.clickRegistrationSubmitButton();
    }

    @Then("^I verify that reCaptcha is previewed$")
    public void iVerifyThatReCaptchaIsPreviewed() {
        driver.switchTo().frame(registrationPage.getReCaptchaIFrame());
        registrationPage.verifyReCaptchaVerifyButton();
        driver.switchTo().defaultContent();
    }

    @And("^I choose Men category$")
    public void iChooseMenCategory() {
        homePage.selectMenCategory();
    }

    @And("^I choose Football Boots subcategory$")
    public void iChooseFootballBootsSubcategory() {
        homePage.selectFootballBootsSubCategory();
    }

    @And("^I choose the first product$")
    public void iChooseTheFirstProduct() {
        homePage.selectFirstProduct();
    }

    @And("^I add to the bag the selected product$")
    public void iAddToTheBagTheSelectedProduct() {
        homePage.clickAddToBagButton();
    }

    @And("^I select the first available size$")
    public void iSelectTheFirstAvailableSize() {
        homePage.selectFirstAvailableSize();
    }

    @And("^I answer No Thanks for personalization question$")
    public void iAnswerNoThanksForPersonalizationQuestion() {
        driver.switchTo().frame(homePage.noThanksIFrame());
        homePage.clickNoThanksButton();
        driver.switchTo().defaultContent();
    }

    @And("^I proceed the checkout$")
    public void iProceedTheCheckout() {
        homePage.clickCheckoutButton();
    }
}

