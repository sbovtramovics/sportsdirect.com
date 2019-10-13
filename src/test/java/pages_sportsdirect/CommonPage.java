package pages_sportsdirect;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertTrue;


public class CommonPage {
//    @FindBy(how = How.CSS, using = ".advertPopup button.close")
//    private WebElement closeButton;
    @FindBy(how = How.CLASS_NAME, using = "TopLinkMenu")
    private WebElement signInButton;
//    @FindBy(how = How.CSS, using = "[id*='cmdRegister']")
//    private WebElement registerButton;
//    @FindBy(how = How.CSS, using = "input.dnnFormRequired")
//    private WebElement registrationDataInputForm;
//    @FindBy(how = How.CSS, using = "input[id*='FirstName']")
//    private WebElement firstNameInputForm;
//    @FindBy(how = How.CSS, using = "input[id*='LastName']")
//    private WebElement lastNameInputForm;
//    @FindBy(how = How.CSS, using = "input[id*='EmailAddress']")
//    private WebElement emailAddressInputForm;
//    @FindBy(how = How.CSS, using = "input[id*='Password']")
//    private WebElement passwordInputForm;
//    @FindBy(how = How.CSS, using = "input[id*='Confirm']")
//    private WebElement confirmInputForm;
//    @FindBy(how = How.CSS, using = ".DateSelector.Day")
//    private WebElement daySelectBox;
//    @FindBy(how = How.CSS, using = ".DateSelector.Month")
//    private WebElement monthSelectBox;
//    @FindBy(how = How.CSS, using = ".DateSelector.Year")
//    private WebElement yearSelectBox;
//    @FindBy(how = How.CSS, using = ".RegistrationSubmit")
//    private WebElement registrationSubmitButton;
//    @FindBy(how = How.ID, using = "recaptcha-verify-button")
//    private WebElement reCaptchaVerifyButton;
//    @FindBy(how = How.CSS, using = "[title='recaptcha challenge']")
//    private WebElement reCaptchaIFrame;

//    public String getPageUrl() {
//        return "https://lv.sportsdirect.com";
//    }

    public void clickSignIn() {
        signInButton.click();
    }

//    public void clickRegisterNewUser() {
//        registerButton.click();
//    }
//
//    public void setRegistrationData(String testFirstName, String testLastName, String email, String password) {
//        firstNameInputForm.sendKeys(testFirstName);
//        lastNameInputForm.sendKeys(testLastName);
//        emailAddressInputForm.sendKeys(email);
//        passwordInputForm.sendKeys(password);
//        confirmInputForm.sendKeys(password);
//    }
//
//    public void setDateOfBirth(String dateOfBirth) {
//        String delimiter = "\\.";
//        String[] dateArray = dateOfBirth.split(delimiter);
//        new Select(daySelectBox).selectByValue(dateArray[0]);
//        new Select(monthSelectBox).selectByValue(dateArray[1]);
//        new Select(yearSelectBox).selectByValue(dateArray[2]);
//    }
//
//    public void clickCloseButton() {
//        closeButton.click();
//    }
//
//    public WebElement closeButton() {
//        return closeButton;
//    }
//
//    public void verifyReCaptchaVerifyButton() {
//        assertTrue(reCaptchaVerifyButton.isDisplayed());
//    }
//
//    public WebElement getReCaptchaIFrame() {
//        return reCaptchaIFrame;
//    }
//
//    public void clickRegistrationSubmitButton() {
//        registrationSubmitButton.click();
//    }
}
