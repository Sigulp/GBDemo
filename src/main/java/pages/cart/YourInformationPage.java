package pages.cart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourInformationPage {

    public YourInformationPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    //region Elements
    @FindBy(id = "first-name")
    public WebElement firstNameInput;

    @FindBy(id = "last-name")
    public WebElement lastNameInput;

    @FindBy(id = "postal-code")
    public WebElement postalCodeInput;

    @FindBy(id = "continue")
    public WebElement continueButton;
    //endregion

    //region elements function
    public void fillFirstNameInput(String firstName){
        firstNameInput.sendKeys(firstName);
    }

    public void fillLastNameInput(String lastName){
        lastNameInput.sendKeys(lastName);
    }

    public void fillPostalCodeInput(String postalCode){
        postalCodeInput.sendKeys(postalCode);
    }

    public void clickToContinueButton(){
        continueButton.click();
    }
    //endregion
}
