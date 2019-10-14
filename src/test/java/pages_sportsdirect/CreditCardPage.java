package pages_sportsdirect;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.Assert.assertEquals;

public class CreditCardPage {
    @FindBy(how = How.NAME, using = "CardCaptureFrame")
    private WebElement creditCardIFrame;
    @FindBy(how = How.CSS, using = "input[id='card_number']")
    private WebElement creditCardNumberInputForm;
    @FindBy(how = How.CSS, using = "input[id='exp_month']")
    private WebElement expiryMonthInputForm;
    @FindBy(how = How.CSS, using = "input[id='exp_year_2digit']")
    private WebElement expiryYearInputForm;
    @FindBy(how = How.CSS, using = "input[id='cv2_number']")
    private WebElement securityCodeInputForm;
    @FindBy(how = How.CLASS_NAME, using = "ContinueOn")
    private WebElement continueSecurelyButton;
    @FindBy(how = How.CLASS_NAME, using = "error_message")
    private WebElement errorMessage;

    public void fillCreditCardData(String creditCardNumber, String expiryDate, String securityCode) {
        String delimiter = "\\.";
        String[] expiryDateArray = expiryDate.split(delimiter);
        creditCardNumberInputForm.sendKeys(creditCardNumber);
        expiryMonthInputForm.sendKeys(expiryDateArray[0]);
        expiryYearInputForm.sendKeys(expiryDateArray[1]);
        securityCodeInputForm.sendKeys(securityCode);
    }

    public void clickContinueSecurelyButton() {
        continueSecurelyButton.click();
    }

    public void veryfyThatErrorMessageIsDisplayed(String errorMessageText) {
        assertEquals("Error text message does not match expected", errorMessage.getText(), errorMessageText);
    }

    public WebElement creditCardIFrame() {
        return creditCardIFrame;
    }
}