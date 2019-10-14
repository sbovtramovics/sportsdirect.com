package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages_sportsdirect.*;

import static util.Randomizes.randomEmailAddress;

public class SportsDirectSteps {
    static HomePage homePage;
    static LoginPage loginPage;
    static RegistrationPage registrationPage;
    static WelcomePage welcomePage;
    static DeliveryPage deliveryPage;
    static AddressPage addressPage;
    static PaymentPage paymentPage;
    static CreditCardPage creditCardPage;
    private WebDriver driver;
    private WebDriverWait wait;

    public SportsDirectSteps() {
        this.driver = Hooks.driver;
        this.wait = Hooks.wait;
        registrationPage = PageFactory.initElements(Hooks.driver, RegistrationPage.class);
        addressPage = PageFactory.initElements(Hooks.driver, AddressPage.class);
        welcomePage = PageFactory.initElements(Hooks.driver, WelcomePage.class);
        deliveryPage = PageFactory.initElements(Hooks.driver, DeliveryPage.class);
        paymentPage = PageFactory.initElements(Hooks.driver, PaymentPage.class);
        creditCardPage = PageFactory.initElements(Hooks.driver, CreditCardPage.class);
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
        wait.until(ExpectedConditions.visibilityOf(homePage.checkoutButton()));
        homePage.clickCheckoutButton();
    }

    @And("^I click the Continue Securely Button$")
    public void iClickTheContinueSecurelyButton() {
        homePage.clickContinueSecurelyButton();
    }

    @And("^I fill email field with \"([^\"]*)\" email and click the Continue Securely Button again$")
    public void iFillEmailFieldWithEmailAndClickTheContinueSecurelyButtonAgain(String email) {
        if (email.equals("random"))
            email = randomEmailAddress();
        welcomePage.setRegistrationEmail(email);
        welcomePage.clickContinueSecurelyButtonAgain();
    }

    @And("^I fill the registration data with following information: \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void iFillTheRegistrationDataWithFollowingInformation(String firstName, String lastName, String address, String townCity, String postCode, String phoneNumber) {
        addressPage.setAddressData(firstName, lastName, address, townCity, postCode, phoneNumber);
        addressPage.clickContinueSecurelyButton();
    }

    @And("^I select Standard Delivery method and click the Continue Securely Button again$")
    public void iSelectStandardDeliveryMethodAndClickTheContinueSecurelyButtonAgain() {
        deliveryPage.selectStandardDeliveryMethod();
        deliveryPage.clickContinueSecurelyButton();
    }

    @And("^I select the Credit Card Payment method$")
    public void iSelectTheCreditCardPaymentMethod() {
        paymentPage.selectCreditCardPaymentMethod();
    }

    @And("^I fill Credit Card fields with following data: Credit Card number \"([^\"]*)\", expiry date \"([^\"]*)\", Security Code \"([^\"]*)\" and click the Continue Securely Button again$")
    public void iFillCreditCardFieldsWithFollowingDataCreditCardNumberExpiryDateSecurityCodeAndClickTheContinueSecurelyButtonAgain(String creditCardNumber, String expiryDate, String securityCode) {
        driver.switchTo().frame(creditCardPage.creditCardIFrame());
        creditCardPage.fillCreditCardData(creditCardNumber, expiryDate, securityCode);
        creditCardPage.clickContinueSecurelyButton();
    }

    @Then("^I verify that error with text: \"([^\"]*)\" is displayed$")
    public void iVerifyThatErrorWithTextIsDisplayed(String errorMessageText) {
        creditCardPage.veryfyThatErrorMessageIsDisplayed(errorMessageText);
        driver.switchTo().defaultContent();
    }
}

