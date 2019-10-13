package pages_sportsdirect;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends CommonPage{
    @FindBy(how = How.CSS, using = ".advertPopup button.close")
    private WebElement closeButton;
    @FindBy(how = How.CSS, using = "[href='/mens']")
    private WebElement menCategory;
    @FindBy(how = How.CSS, using = "[href='/football/football-boots/mens-football-boots?promo_name=landing-mens']")
    private WebElement footballBootsSubCategory;
    @FindBy(how = How.CSS, using = ".s-productthumbbox")
    private WebElement firstProduct;
    @FindBy(how = How.CSS, using = ".addToBag")
    private WebElement addToBagButton;
    @FindBy(how = How.CSS, using = ".sizeButtonli:not(.greyOut)")
    private WebElement firstAvailableSize;
    @FindBy(how = How.ID, using = "aPersNoThanksBag")
    private WebElement noThanksButton;
    @FindBy(how = How.ID, using = "aCheckout")
    private WebElement checkoutButton;
    @FindBy(how = How.CSS, using = "[src*='AddToBag']")
    private WebElement noThanksIFrame;

    public String getPageUrl() {
        return "https://lv.sportsdirect.com";
    }

    public void clickCloseButton() {
        closeButton.click();
    }

    public void selectMenCategory() {
        menCategory.click();
    }

    public void selectFootballBootsSubCategory() {
        footballBootsSubCategory.click();
    }

    public void selectFirstProduct() {
        firstProduct.click();
    }

    public void clickAddToBagButton() {
        addToBagButton.click();
    }

    public void selectFirstAvailableSize() {
        firstAvailableSize.click();
    }

    public void clickNoThanksButton() {
        noThanksButton.click();
    }

    public void clickCheckoutButton() {
        checkoutButton.click();
    }

    public WebElement closeButton() {
        return closeButton;
    }

    public WebElement noThanksIFrame() {
        return noThanksIFrame;
    }
}