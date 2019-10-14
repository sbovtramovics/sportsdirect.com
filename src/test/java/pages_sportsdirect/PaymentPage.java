package pages_sportsdirect;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentPage {
    @FindBy(how = How.CLASS_NAME, using = "CardsIcons")
    private WebElement creditCardPaymentMethod;

    public void selectCreditCardPaymentMethod() {
        creditCardPaymentMethod.click();
    }
}