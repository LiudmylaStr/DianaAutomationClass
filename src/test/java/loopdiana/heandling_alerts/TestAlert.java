package loopdiana.heandling_alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestAlert {
    @Test
    public void testAlert(){
        String alertType= "alertbox";

        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        WebElement displayAlertButton = driver.findElement
                (By.xpath("//button[@onclick='"+alertType+"()']"));
        displayAlertButton.click();
        Alert alertOne= driver.switchTo().alert();
        System.out.println(alertOne.getText());
        alertOne.accept();
        driver.quit();


    }
    @Test
    public void alertWithOkAndCancel() throws InterruptedException {
        String alertType = "confirmbox";
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        WebElement alertWithOkAndCancel = driver.findElement(By.xpath("//div[1]/ul/li[2]/a"));
        alertWithOkAndCancel.click();
        Thread.sleep(3000);
        WebElement displayAlertButton = driver.findElement
                (By.xpath("//button[@onclick='" + alertType + "()']"));
        displayAlertButton.click();
        Alert alertTwo = driver.switchTo().alert();
        System.out.println(alertTwo.getText());
        // To accept the confirmation (click OK)
        alertTwo.accept();
        WebElement pressedOk = driver.findElement(By.id("demo"));
        System.out.println(pressedOk.getText());
        // To dismiss the confirmation (click Cancel)
//         alertTwo.dismiss();
//        WebElement pressedCancel = driver.findElement(By.id("demo"));
//        System.out.println(pressedCancel.getText());
        driver.quit();
    }

    @Test
    public void alertWithTextbox() throws InterruptedException {
        //String alertType = "";
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");

        WebElement buttonAlertWithTextbox = driver.findElement(By.xpath("//div[1]/ul/li[3]/a"));
        buttonAlertWithTextbox.click();
       // Thread.sleep(2000);
         WebElement buttonToPromtext = driver.findElement(By.xpath ("//button[@onclick='promptbox()']"));
         buttonToPromtext.click();
         Alert alertThree = driver.switchTo().alert();
        System.out.println(alertThree.getText());
        alertThree.sendKeys(" Lucy");
       // Thread.sleep(1000);
        alertThree.accept();
        WebElement pressedOkWhithName= driver.findElement(By.id("demo1"));
        System.out.println(pressedOkWhithName.getText());

        driver.quit();


    }

}
