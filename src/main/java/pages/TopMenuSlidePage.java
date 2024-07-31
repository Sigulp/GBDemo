package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenuSlidePage {

    public TopMenuSlidePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //region elements

    @FindBy(xpath = "//a[@data-test = \"shopping-cart-link\"]")
    public WebElement shoppingCartButton;
    //endregion

    //region elements functions
    public void clickToShoppingCartButton(){
         shoppingCartButton.click();
    }
    //endregion
}
