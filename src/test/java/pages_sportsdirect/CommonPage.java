package pages_sportsdirect;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class CommonPage {
    @FindBy(how = How.CLASS_NAME, using = "login")
    private WebElement signInButton;

    public void clickSignIn() {
        signInButton.click();
    }
}
