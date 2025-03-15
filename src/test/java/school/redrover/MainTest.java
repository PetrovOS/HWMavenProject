package school.redrover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class MainTest {

    @Test
    public void testSum() {
        assertEquals(Main.getSum(1,1), 2);
        assertEquals(Main.getSum(0,0), 0);
        assertEquals(Main.getSum(-10,-5), -15);
        assertEquals(Main.getSum(-10,5), -5);
    }

    @Test
    public void testString() {
        assertEquals(Main.getString("Hello"),"HELLO");
        assertEquals(Main.getString("Good Bye"), "GOOD BYE");
        assertEquals(Main.getString("bye"), "BYE");
        assertEquals(Main.getString("How was your day"), "HOW WAS YOUR DAY");
    }

    @Test
    public void testWeb() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        textBox.sendKeys("Selenium");
        submitButton.click();

        Thread.sleep(1000);

        WebElement message = driver.findElement(By.id("message"));
        String value = message.getText();
        assertEquals("Received!", value);

        driver.quit();
    }

}
