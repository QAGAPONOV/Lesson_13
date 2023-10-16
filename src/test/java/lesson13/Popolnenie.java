package lesson13;

import lesson13.Data;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class Popolnenie extends Data {

    private By inputPhone = By.xpath("//input[@id='connection-phone']");
    private By inputCash = By.xpath("//input[@id='connection-sum']");
    private By inputEmail = By.xpath("//input[@id='connection-email']");
    private By enter = By.xpath("//button[@class='button button__default '][1]");
    private By getCash = By.xpath("//div[@class='header__container']//p[@class='header__payment-amount']");


    @Test
    public void popolnenie() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Data getDate = new Data();
        driver.get(getDate.getUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(inputPhone).sendKeys(getDate.phone);
        driver.findElement(inputCash).sendKeys(getDate.cash);
        driver.findElement(inputEmail).sendKeys(getDate.email);
        driver.findElement(enter).click();
        WebElement getCashInfo = driver.findElement(By.xpath("//div[@class='header__container']//p[@class='header__payment-amount']"));
        Assert.assertEquals("10.00 BYN", getCashInfo.getDomAttribute("class"));
        sleep(5000);
        driver.quit();

    }
}
