package pages_sportsdirect;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WelcomePage {
    @FindBy(how = How.CSS, using = "[id*='btnGuestCustomer']")
    private WebElement continueSecurelyButton;
    @FindBy(how = How.CSS, using = "input[id*='GuestCustomerEmailAddress']")
    private WebElement guestCustomerEmailAddress;

    public void clickContinueSecurelyButtonAgain() {
        continueSecurelyButton.click();
    }

    public void setRegistrationEmail(String email) {
        guestCustomerEmailAddress.sendKeys(email);
    }
}
