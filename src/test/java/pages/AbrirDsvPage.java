package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
<<<<<<< HEAD
import org.openqa.selenium.WebElement;
=======
>>>>>>> 4f5bb35 (Acesso correto a DSV e clique em Minhas aplicações)

public class AbrirDsvPage {

    private WebDriver driver;

    public AbrirDsvPage(WebDriver driver) {
        this.driver = driver;
    }

<<<<<<< HEAD
    public void acessarSistemaDSV(String url) {
        driver.get(url);
    }

    public void clicarMinhasAplicacoes() {
        WebElement link = driver.findElement(By.linkText("Minhas Aplicações"));
        link.click();
    }

=======
    // Vai direto para a página de Minhas Aplicações
    public void acessarMinhasAplicacoes() {
        driver.get("https://www.dsv.bradseg.com.br/admin_frames.asp?URL=https://www.dsv.bradseg.com.br/Minhas_Aplicacoes.asp");
    }

    // Valida se o logo da SARE está visível
>>>>>>> 4f5bb35 (Acesso correto a DSV e clique em Minhas aplicações)
    public boolean validarLogoSARE() {
        return driver.findElement(By.className("logo-bradseg")).isDisplayed();
    }
}
