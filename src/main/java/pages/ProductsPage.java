package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

public class ProductsPage {

    public ProductsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //region elements
    @FindBy(xpath = "//select[@data-test = \"product-sort-container\"]")
    public WebElement filterSelect;

    @FindBy(xpath = "//button[contains(@class, \"btn_inventory\") and text() = \"Add to cart\"]")
    public List<WebElement> addToCartButtonList;

    @FindBy(xpath = "//button[contains(@class, \"btn_inventory\") and text() = \"Remove\"]")
    public List<WebElement> removeFromCartButtonList;

    //endregion

    //region elements function

    public void chooseFilterSelectValue(String value){
        filterSelect.click();

        filterSelect.findElement(By.xpath(".//option[text() = \"" + value + "\"]")).click();
    }

    public void clickToAddToCartButtonByIndex(int index){
        addToCartButtonList.get(index).click();
    }

    public void clickToRemoveFromCartButtonByIndex(int index){
        removeFromCartButtonList.get(index).click();
    }

    //endregion
}
