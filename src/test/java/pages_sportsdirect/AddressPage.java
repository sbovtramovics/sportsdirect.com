package pages_sportsdirect;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddressPage {
    @FindBy(how = How.CSS, using = "input[id*='FirstName']")
    private WebElement firstNameInputForm;
    @FindBy(how = How.CSS, using = "input[id*='LastName']")
    private WebElement lastNameInputForm;
    @FindBy(how = How.CSS, using = "input[id*='Postcode']")
    private WebElement postCodeInputForm;
    @FindBy(how = How.CSS, using = "input[id*='Telephone']")
    private WebElement phoneNumberInputForm;
    @FindBy(how = How.CSS, using = "input[id*='Address1']")
    private WebElement addressInputForm;
    @FindBy(how = How.CSS, using = "input[id*='TownCity']")
    private WebElement townCityInputForm;
    @FindBy(how = How.CLASS_NAME, using = "ContinueOn")
    private WebElement continueSecurelyButton;

    public void setAddressData(String testFirstName, String testLastName, String address, String townCity, String postCode, String phoneNumber) {
        firstNameInputForm.sendKeys(testFirstName);
        lastNameInputForm.sendKeys(testLastName);
        postCodeInputForm.sendKeys(postCode);
        addressInputForm.sendKeys(address);
        townCityInputForm.sendKeys(townCity);
        phoneNumberInputForm.sendKeys(phoneNumber);
    }

    public void clickContinueSecurelyButton() {
        continueSecurelyButton.click();
    }
}