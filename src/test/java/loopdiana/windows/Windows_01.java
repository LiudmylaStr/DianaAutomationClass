package loopdiana.windows;

import loopdiana.utils.WebDriverUtil;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Windows_01 {
//    @Test
//    WebDriver driver = WebDriverUtil.getDriver("chrome");
//        driver.manage().window().maximize();
//        driver.get("https://www.nba.com/");


    @Test
    public void window_handle() {
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        String windowHandle = driver.getWindowHandle();
        System.out.println("windowHandle = " + windowHandle);
        try {
            driver.switchTo().window("333");
        } catch (NoSuchWindowException exception) {
            System.out.println("No such window");
        }
    }
}
