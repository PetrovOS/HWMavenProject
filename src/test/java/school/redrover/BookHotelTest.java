package school.redrover;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class BookHotelTest {

    @Test
    public void bookOldFarmhouseTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://automationintesting.online/");

        Thread.sleep(1000);

        WebElement inputName = driver.findElement(By.xpath("//input[@id='name']"));
        inputName.sendKeys("Vasiliy");

        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='email']"));
        inputEmail.sendKeys("qwerty@mailto.ru");

        WebElement inputPhone = driver.findElement(By.xpath("//input[@id='phone']"));
        inputPhone.sendKeys("+345456789234");

        WebElement inputSubject = driver.findElement(By.cssSelector("input#subject"));
        inputSubject.sendKeys("The Old Farmhouse, Shady Street, Newfordburyshire, NE1 410S");

        WebElement textArea = driver.findElement(By.cssSelector("textarea.form-control"));
        textArea.sendKeys("Hello! I and my family, we want to book your house.\n" +
                "From: 28.03.2025 To: 10.04.2025\n" + "Best regards Vasiliy Family.");

        WebElement button = driver.findElement(By.xpath("//button[@id='submitContact']"));
        button.click();

        Assert.assertEquals("Thanks for getting in touch", "Thanks for getting in touch");

        driver.quit();
    }
}
