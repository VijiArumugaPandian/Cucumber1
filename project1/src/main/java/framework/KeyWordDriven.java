package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyWordDriven extends CommonDeclaration{

public void OpenBrowser(String url) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	
	
}

public void ClickOn(String xpt) {
	driver.findElement(By.xpath(xpt)).click();
}
public void SendValues(String pat,String data) {
	driver.findElement(By.xpath(pat)).sendKeys(data);
}
}
