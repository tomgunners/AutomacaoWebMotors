package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Setup.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	// MÉTODO RESPONSÁVEL PARA LIMPAR O CAMPO DE CIDADE / ESTADO
	public void limpaCidadeEstado () throws Exception {
		driver.findElement(By.id("CidadeEstadoLimpar")).click();
		Thread.sleep(500);
	}
	
	// MÉTODO RESPONSÁVEL PELA SELEÇÃO DA MARCA
	public void selecionaMarca() throws Exception {
		driver.findElement(By.xpath("//div[@id='MultiPurpose_Marca']/div/a/span[2]")).click();
		driver.findElement(By.linkText("HONDA")).click();
		Thread.sleep(500);
	}

	// MÉTODO RESPONSÁVEL PELA SELEÇÃO DO MODELO
	public void selecionaModelo() throws Exception {
		driver.findElement(By.xpath("//div[@id='MultiPurpose_Modelo']/div/a")).click();
		driver.findElement(By.linkText("CITY")).click();
		Thread.sleep(500);
	}

	// MÉTODO RESPONSÁVEL PELA SELEÇÃO DA VERSÃO
	public void selecionaVersao() throws Exception {
		driver.findElement(By.xpath("//div[@id='MultiPurpose_Versao']/div")).click();
		driver.findElement(By.linkText("Todas")).click();
		Thread.sleep(500);
	}

	// MÉTODO RESPONSÁVEL POR CLICAR NO BOTÃO DE "VER OFERTAS"
	public void btnVerOfertas() throws Exception {
		driver.findElement(By.id("btnBuscar")).click();
		Thread.sleep(500);
	}
}
