package StepDefinition;

import org.openqa.selenium.WebDriver;

import Page.HomePage;
import Page.ResultadoPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class validandoBuscaStep {

	protected static WebDriver driver;

	@Given("^que esteja na home do site$")
	public void que_esteja_na_home_do_site() throws Throwable{
		driver = new Setup.Configuracao().abrirNavegador("chrome", "www.webmotors.com.br");
	}

	@When("^seleciono a marca o modelo e a versao$")
	public void selecione_a_marca_o_modelo_e_a_versao() throws Exception {
		new HomePage(driver).limpaCidadeEstado();
		new HomePage(driver).selecionaMarca();
		new HomePage(driver).selecionaModelo();
		new HomePage(driver).selecionaVersao();
	}

	@Then("^vou clicar no botao VER OFERTAS$")
	public void eu_clicar_no_botao_VER_OFERTAS() throws Exception {
		new HomePage(driver).btnVerOfertas();
	}

	
	@Given("^que esteja na tela de resultado$")
	public void que_esteja_na_tela_de_resultado() throws Exception {
		new ResultadoPage(driver).validarPaginaDeResultado("https://www.webmotors.com.br/carros/estoque/honda/city?tipoveiculo=carros&marca1=honda&modelo1=city&estadocidade=estoque");
	}

	@When("^eu clicar no botao PARTICULAR$")
	public void eu_clicar_no_botao_PARTICULAR() throws Exception {
	    new ResultadoPage(driver).CheckboxParticular();
	}

	@Then("^deve me mostrar a quantidade em estoque$")
	public void deve_me_mostrar_a_quantidade_em_estoque() throws Throwable {
		new ResultadoPage(driver).validaCarrosEncontrados();	
		}


}
