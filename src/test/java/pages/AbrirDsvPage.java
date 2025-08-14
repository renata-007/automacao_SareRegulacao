package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AbrirDsvPage {

    private WebDriver driver;

    public AbrirDsvPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarSistemaDSV(String url) {
        driver.get(url);
    }

    public void clicarMinhasAplicacoes() {
        WebElement link = driver.findElement(By.linkText("Minhas Aplicações"));
        link.click();
    }

    public boolean validarLogoSARE() {
        return driver.findElement(By.className("logo-bradseg")).isDisplayed();
    }
}
