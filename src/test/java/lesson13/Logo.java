package lesson13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class Logo {
    private By logotip = By.xpath("//div[@class='pay__partners']");

    @Test
    public void bank() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Data getDate = new Data();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(getDate.getUrl);
        driver.findElement(logotip).click();
        sleep(5000);
        driver.quit();
    }
}
