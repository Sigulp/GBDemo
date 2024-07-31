package pages.cart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage {

    public CheckoutOverviewPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //region elements
    @FindBy(xpath = "//div[@data-test = \"total-label\"]")
    public WebElement totalPriceValueElement;

    @FindBy(id = "cancel")
    public WebElement cancelButton;

    @FindBy(id = "finish")
    public WebElement finishButton;
    //endregion

    //region element functions
    public void clickToCancelButton(){
        cancelButton.click();
    }

    public void clickToFinishButton(){
        finishButton.click();
    }

    public boolean isTotalValueLowerThanFifty(){
        String totalValueFullText = totalPriceValueElement.getText();
        String totalValue = (totalValueFullText.split("\\$", 2))[1].split("\\.", 2)[0];

        return Integer.parseInt(totalValue) <= 50;
    }
    //endregion
}
