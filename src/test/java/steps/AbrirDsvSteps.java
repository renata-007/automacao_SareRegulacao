package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;
<<<<<<< HEAD

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import pages.AbrirDsvPage;

public class AbrirDsvSteps {

    private WebDriver driver;
    private AbrirDsvPage abrirDsvPage;

    @Dado("que acesso SARE gestão e regulação")
    public void acessarSare() {
        // Configura e abre o Chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        abrirDsvPage = new AbrirDsvPage(driver);
        abrirDsvPage.acessarSistemaDSV("URL_DSV"); // substitua pela URL real
=======
import pages.AbrirDsvPage;
import support.Hooks;
import org.openqa.selenium.WebDriver;

public class AbrirDsvSteps {

    private AbrirDsvPage abrirDsvPage;
    private WebDriver driver;

    @Dado("que acesso SARE gestão e regulação")
    public void paginaInicial() {
        driver = Hooks.driver;
        abrirDsvPage = new AbrirDsvPage(driver);
>>>>>>> 4f5bb35 (Acesso correto a DSV e clique em Minhas aplicações)
    }

    @Quando("clico em Minhas Aplicações")
    public void clicarMinhasAplicacoes() {
<<<<<<< HEAD
        abrirDsvPage.clicarMinhasAplicacoes();
=======
        abrirDsvPage.acessarMinhasAplicacoes();
>>>>>>> 4f5bb35 (Acesso correto a DSV e clique em Minhas aplicações)
    }

    @Entao("valido que o logo da SARE está visível")
    public void validarLogo() {
        if (!abrirDsvPage.validarLogoSARE()) {
            throw new AssertionError("Logo da SARE não está visível!");
        }
<<<<<<< HEAD
        // Fecha o Chrome após validação
        driver.quit();
=======
>>>>>>> 4f5bb35 (Acesso correto a DSV e clique em Minhas aplicações)
    }
}
