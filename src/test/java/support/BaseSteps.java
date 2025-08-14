package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AbrirDsvPage;

public class BaseSteps {

    protected WebDriver driver;
    protected AbrirDsvPage abrirDsvPage;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        abrirDsvPage = new AbrirDsvPage(driver);
    }

    @After
    public void teardown() {
        if(driver != null) {
            driver.quit();
        }
    }
}
