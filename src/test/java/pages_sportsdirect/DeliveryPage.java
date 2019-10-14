package pages_sportsdirect;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DeliveryPage {
    @FindBy(how = How.CLASS_NAME, using = "InnerMethods")
    private WebElement standardDeliveryMethod;
    @FindBy(how = How.XPATH, using = "(//*[contains(@class, 'GoodsSupplyTermsAndConditions')]/following-sibling::*[contains(@class, 'ContinueOn')])[4]")
    private WebElement continueSecurelyButton;

    public void selectStandardDeliveryMethod() {
        standardDeliveryMethod.click();
    }

    public void clickContinueSecurelyButton() {
        continueSecurelyButton.click();
    }
}