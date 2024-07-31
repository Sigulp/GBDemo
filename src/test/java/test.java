
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test {
    public WebDriver driver;
    public PageUI ui;

    @BeforeMethod
    public void beforeEach(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        chromeOptions.addArguments("--start-maximized");

        this.driver = new ChromeDriver(chromeOptions);
        this.ui = new PageUI(driver);

    }

    @Test
    public void testSkeleton(){
        driver.get("https://www.saucedemo.com/");

        Assert.assertTrue(ui.loginPage.userNameInput.isDisplayed(), "Page don't load");

        ui.loginPage.loginToSauceDemoSite("standard_user", "secret_sauce");

        Assert.assertTrue(ui.productsPage.filterSelect.isDisplayed(), "Products page select don't load");

        ui.productsPage.chooseFilterSelectValue("Price (high to low)");

        //Select products
        ui.productsPage.clickToAddToCartButtonByIndex(0);
        ui.productsPage.clickToAddToCartButtonByIndex(2);
        ui.productsPage.clickToAddToCartButtonByIndex(3);

        ui.topMenuSlidePage.clickToShoppingCartButton();

        ui.yourCartPage.clickToCheckoutButton();

        ui.yourInformationPage.fillFirstNameInput("Bence");
        ui.yourInformationPage.fillLastNameInput("Bajusz");
        ui.yourInformationPage.fillPostalCodeInput("1234");
        ui.yourInformationPage.clickToContinueButton();

        if(!ui.checkoutOverviewPage.isTotalValueLowerThanFifty()){
            ui.checkoutOverviewPage.clickToCancelButton();
            ui.productsPage.clickToRemoveFromCartButtonByIndex(1);
        }

        ui.topMenuSlidePage.clickToShoppingCartButton();

        ui.yourCartPage.clickToCheckoutButton();

        ui.yourInformationPage.fillFirstNameInput("Bence");
        ui.yourInformationPage.fillLastNameInput("Bajusz");
        ui.yourInformationPage.fillPostalCodeInput("1234");
        ui.yourInformationPage.clickToContinueButton();

        ui.checkoutOverviewPage.clickToFinishButton();
        Assert.assertTrue(ui.thankYouPage.thankyouText.isDisplayed());

        try {
            synchronized (driver){
                driver.wait(10000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @AfterMethod
    public void afterEach(){
        driver.quit();
    }
}
