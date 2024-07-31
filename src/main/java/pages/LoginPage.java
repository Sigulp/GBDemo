package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //region elements
    /**
     * Login page user name input field
     */
    @FindBy(id = "user-name")
    public WebElement userNameInput;

    /**
     * Login page password input field
     */
    @FindBy(id = "password")
    public WebElement passwordInput;

    /**
     * Login page login button
     */
    @FindBy(id = "login-button")
    public WebElement loginButton;

    //endregion

    //region element function

    /**
     * Fill the user name input field
     * @param userName
     */
    public void fillUserNameInput(String userName){
        userNameInput.sendKeys(userName);
    }

    /**
     * Fill the password input field
     * @param password
     */
    public void fillPasswordInput(String password){
        passwordInput.sendKeys(password);
    }

    /**
     * Click to login button
     */
    public void clickToLoginButton(){
        loginButton.click();
    }
    //endregion

    //region other function

    /**
     * Login in the demo site with user name and password
     * @param userName
     * @param password
     */
    public void loginToSauceDemoSite(String userName, String password){
        userNameInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
    //endregion

}
