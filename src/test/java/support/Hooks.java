package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Acessa a URL
        driver.get("https://www.dsv.bradseg.com.br/");

        // Tenta passar tela de segurança SSL (avançado)
        try {
            if(driver.findElements(By.id("details-button")).size() > 0) {
                driver.findElement(By.id("details-button")).click(); // botão avançado
                driver.findElement(By.id("proceed-link")).click();   // link continuar
            }
        } catch(Exception e) {
            System.out.println("Tela de segurança não encontrada ou já passada.");
        }

        // Aguarda iframe principal aparecer
        try {
            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("iframe_home")));
            driver.switchTo().defaultContent(); // volta para o conteúdo principal
        } catch(Exception e) {
            System.out.println("iframe 'iframe_home' não carregou ou não existe no momento.");
        }
    }

    @After
    public void tearDown() {
        if(driver != null) {
            driver.quit();
        }
    }
}
