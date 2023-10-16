package lesson13;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class Service extends Data {
    private By Enter1 = By.xpath("//div[contains(@class,'pay__wrapper')]//a[@href='/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/']");
    private By Enter2 = By.xpath("//button[@id='cookie-agree']");

    @Test
    public void service() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Data getDate = new Data();

        driver.get(getDate.getUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(Enter2).click();
        driver.findElement(Enter1).click();

        String getTitl = driver.getTitle();
        Assert.assertEquals(getTitl, "Порядок оплаты и безопасность интернет платежей");
        sleep(5000);
        driver.quit();

    }

}