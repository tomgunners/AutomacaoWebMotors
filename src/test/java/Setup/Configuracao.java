package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Configuracao {

	protected WebDriver navegador;

	public WebDriver getDriver() {
		return navegador;

	}

	public void setDriver(WebDriver navegador) {
		this.navegador = navegador;
	}

	public WebDriver abrirNavegador(String nomeNavegador, String url) {

		String propriedadeChrome = "webdriver.chrome.driver";
		String propriedadeChromeCaminho = "/Users/TOM/Downloads/chromedriver.exe";
		String propriedadeFirefox = "webdriver.gecko.driver";
		String prorpiedadeFirefoxCaminho = "/Users/TOM/Downloads/geckodriver.exe";
		String https = "http://";

		if (nomeNavegador.equalsIgnoreCase("chrome")) {
			System.setProperty(propriedadeChrome, propriedadeChromeCaminho);
			WebDriver navegador = new ChromeDriver();
			navegador.manage().window().maximize();
			navegador.get(https + url);
			return navegador;
		} else if (nomeNavegador.equalsIgnoreCase("firefox")) {
			System.setProperty(propriedadeFirefox, prorpiedadeFirefoxCaminho);
			WebDriver navegador = new FirefoxDriver();
			navegador.manage().window().maximize();
			navegador.get(https + url);
			return navegador;
		} 
		return null;
	}

	public void fecharNavegador(WebDriver navegador) {

		this.navegador = navegador;
		navegador.quit();
	}

}
