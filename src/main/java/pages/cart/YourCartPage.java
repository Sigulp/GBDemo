package pages.cart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage {

    public YourCartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //region elements
    @FindBy(id = "checkout")
    public WebElement checkutButton;
    //endregion

    //region elements function
    public void clickToCheckoutButton(){
        checkutButton.click();
    }
    //endregion
}
