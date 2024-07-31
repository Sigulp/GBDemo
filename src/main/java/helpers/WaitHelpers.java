package helpers;

import org.openqa.selenium.WebDriver;

public class WaitHelpers {

    public static void sleep(WebDriver driver, double seconds){
        try {
            synchronized (driver){
                driver.wait((long) (seconds * 1000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
