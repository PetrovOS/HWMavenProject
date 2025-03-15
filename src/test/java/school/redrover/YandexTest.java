package school.redrover;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class YandexTest {

    @Test
    public void testGoogle() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ya.ru");

        Thread.sleep(1000);

        WebElement input = driver.findElement(By.id("text"));
        input.sendKeys("selenium");
        input.sendKeys(Keys.ENTER);

        Thread.sleep(1000);

        Assert.assertEquals("Selenium", "Selenium");

        driver.quit();
    }
}
