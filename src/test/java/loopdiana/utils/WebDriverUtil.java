package loopdiana.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverUtil {

    public static RemoteWebDriver getDriver(String browserType) {
        if (browserType.equalsIgnoreCase("chrome")) {
            return new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            return new FirefoxDriver();
        } else if (browserType.equalsIgnoreCase("safari")) {
            return new SafariDriver();
        } else {
            System.out.println("No driver found");
            return null;
        }
    }

    public static void CheckTitle(String expectedTitle, String actualTitle) {
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Actual title: " + actualTitle + ", mathes expected title: " + expectedTitle + ", => TEST PASSED");
        } else {
            System.out.println("Actual title: + " + actualTitle + ", DOES NOT MATCH expected title: " + expectedTitle + ", => TEST FAILED");
        }
    }

    public static void VerifyElementsAreDisplayed(WebElement element) {
        if (element.isDisplayed()) {
            System.out.println("Element - \"" + element.getText() + "\" is displayed => TEST PASSED");
        } else {
            System.out.println("Element: " + element.getText() + " is NOT displayed, => TEST FAILED");
        }
    }

    public static void ValidateLogIn(WebElement element) {
        if (element.isDisplayed()) {
            System.out.println("Element - \"" + element.getText() + "\" is displayed, LOGIN is successful => TEST PASSED");
        } else {
            System.out.println("Element: " + element.getText() + " is NOT displayed, LOGIN is successful => TEST FAILED");
        }
    }

    public static void ValidateLogOut(WebElement element) {
        if (element.isDisplayed()) {
            System.out.println("Element - \"" + element.getText() + "\" is displayed, LOGOUT is successful => TEST PASSED");
        } else {
            System.out.println("Element: " + element.getText() + " is NOT displayed, LOGOUT is successful => TEST FAILED");
        }
    }

    public static void elementEquals(String expectedElement, String actualElement) {
        if (actualElement.equals(expectedElement)) {
            System.out.println("Actual element is: \"" + actualElement + "\", matches expected element: \"" + expectedElement + "\", => TEST PASSED");
        } else {
            System.out.println("Actual element is: \"" + actualElement + "\", NOT matches expected element: \"" + expectedElement + "\", => TEST FAILED");
        }

    }
}
