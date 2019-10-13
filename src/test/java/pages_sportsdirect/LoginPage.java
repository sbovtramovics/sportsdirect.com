package pages_sportsdirect;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertTrue;

public class LoginPage extends CommonPage{
    @FindBy(how = How.CSS, using = "[id*='cmdRegister']")
    private WebElement registerButton;

    public void clickRegisterNewUser() {
        registerButton.click();
    }
}
