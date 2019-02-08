package Page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Setup.BasePage;

public class ResultadoPage extends BasePage{

	public ResultadoPage(WebDriver driver) {
		super(driver);
	}

	// MÉTODO RESPONSÁVEL POR VERIFICAR SE A URL É DA PÁGINA QUE DESEJO
	public ResultadoPage validarPaginaDeResultado(String urlEsperada){
		Assert.assertEquals(urlEsperada, driver.getCurrentUrl());
		return new ResultadoPage(driver);
	}
	
	// MÉTODO RESPONSÁVEL POR VALIDAR SE O CHECKBOX PARTICULAR ESTAR ATIVO OU INATIVO
	public void CheckboxParticular() throws Exception {		 
		String isChecked = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div[2]/div[5]")).getAttribute("data-checked");
		if(isChecked=="true")
		{
			driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div[2]/div[5]")).click();
		}
		else 
		{
			driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div[2]/div[5]")).click();
		}
		
		Thread.sleep(1500);
	}
	
	// MÉTODO RESPONSÁVEL POR VERIFICAR SE A QUANTIDADE DE CARROS QUE DESEJO ESTAR CERTA
	public void validaCarrosEncontrados()throws Exception {
		WebElement element = driver.findElement(By.id("box-seo-count"));
		String QtdaCarrosEncontrados = element.getText();
		Assert.assertEquals("2.059 carros encontrados", QtdaCarrosEncontrados);
	}
}
