package loopdiana.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

//import static io.loop.test.utilities.BrowserUtils.clickWithJS;
import static loopdiana.utils.BrowserUtils.clickWithJS;

public class PageUtilities {
    public static void enterTextToTextBox(String FieldName, String faker, int index) throws InterruptedException {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        WebElement textBox;
        try {
            textBox = (index == 0) ? Driver.getDriver().findElement(By.xpath("//label[.='" + FieldName + "']/following-sibling::input[1]"))
                    : Driver.getDriver().findElement(By.xpath("(//label[.='" + FieldName + "'])[" + index + "]/following-sibling::input[1]"));
            clickWithJS(textBox);
            textBox.sendKeys(faker);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
