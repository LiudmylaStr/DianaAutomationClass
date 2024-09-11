package loopdiana.iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IFrameSampleOne {
   @Test
   public void iFrame(){
       WebDriver driver= new ChromeDriver();
       driver.get("https://demo.automationtesting.in/Frames.html");

       driver.manage().window().maximize();
       driver.switchTo().frame(0);
       WebElement elementOne = driver.findElement(By.tagName("h5"));
       System.out.println("elementOne.getText() = " + elementOne.getText());
   }
   @Test
   public void iFrameWithInIFame() throws InterruptedException {
       WebDriver driver = new ChromeDriver();
       driver.get("https://demo.automationtesting.in/Frames.html");
       driver.manage().window().maximize();
       //I locate the button link toc click for switching to Nested iframe
       WebElement elementTwo = driver.findElement(By.partialLinkText("Iframe with in an Iframe"));
       elementTwo.click();
       System.out.println("elementTwo.getText() = " + elementTwo.getText());

       // I switch driver to Nested iframe and locate external iframe
       driver.switchTo().frame(0);
       WebElement elementThree = driver.findElement(By.tagName("h5"));
       Thread.sleep(3000);
       System.out.println("elementThree.getText() = " + elementThree.getText());

WebElement inputBox= driver.findElement(By.xpath("//input[@type='text']"));
       System.out.println("inputBox.getTagName() = " + inputBox.getTagName());

//driver.switchTo().frame(1);
//inputBox.sendKeys("Hello");






   }
}
