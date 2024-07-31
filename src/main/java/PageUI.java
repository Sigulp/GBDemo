import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.ProductsPage;
import pages.TopMenuSlidePage;
import pages.cart.CheckoutOverviewPage;
import pages.cart.ThankYouPage;
import pages.cart.YourCartPage;
import pages.cart.YourInformationPage;

public class PageUI {
    public LoginPage loginPage;
    public ProductsPage productsPage;
    public TopMenuSlidePage topMenuSlidePage;
    public YourCartPage yourCartPage;
    public YourInformationPage yourInformationPage;
    public CheckoutOverviewPage checkoutOverviewPage;
    public ThankYouPage thankYouPage;
    public PageUI(WebDriver driver){
        this.loginPage = new LoginPage(driver);
        this.productsPage = new ProductsPage(driver);
        this.topMenuSlidePage = new TopMenuSlidePage(driver);
        this.yourCartPage = new YourCartPage(driver);
        this.yourInformationPage = new YourInformationPage(driver);
        this.checkoutOverviewPage = new CheckoutOverviewPage(driver);
        this.thankYouPage = new ThankYouPage(driver);
    }
}
