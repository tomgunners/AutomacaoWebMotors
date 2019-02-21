package Setup;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;

public class Hook {
	
	protected WebDriver driver;

	@Given("^que esteja na home do site$")
	public void que_esteja_na_home_do_site() throws Throwable{
		driver = new Setup.Configuracao().abrirNavegador("chrome", "www.webmotors.com.br");
	}

}
