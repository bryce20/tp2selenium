import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumTest {

    WebDriver driver ;
    @Before
    public void setup()
    {
        String browser = System.getProperty("browser");
        if(browser == null)
        {
            driver = new ChromeDriver();
        }
        else if(browser.equals("chrome"))
        {
            driver = new ChromeDriver();
        }
        else if(browser.equals("firefox"))
        {
            driver = new FirefoxDriver();
        }
        else
        {
            driver = new ChromeDriver();
        }

        driver.get("https://www.google.com");
    }


    @After
    public void quitBrowser()
    {
        driver.quit();
    }



    @Test
    public void test1() throws InterruptedException {

        WebElement barrerecherche = driver.findElement(By.id("lst-ib"));
        barrerecherche.sendKeys("canelé");
        barrerecherche.sendKeys(Keys.ENTER);
        Thread.sleep(1500);

    }

   @Test
   public void test3() throws InterruptedException {


       WebElement barrerecherche = driver.findElement(By.id("lst-ib"));
       barrerecherche.sendKeys("manelé");
       Thread.sleep(1500);
       WebElement buttonrecherche = driver.findElement(By.className("lsb"));
       buttonrecherche.click();

       }
}

