package lesson13;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class NameBlock {
    private By block = By.xpath("//h2[contains(text(),'Онлайн пополнение')]");

    private By getName = By.xpath("//div[@class='pay__wrapper']//h2//..//h2");

    @Test
    public void name() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Data getDate = new Data();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(getDate.getUrl);
        sleep(5000);
        driver.quit();
    }
}
