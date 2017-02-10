package android;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class Charts {
	static WiniumDriver winDriver = null;

	public static void main(String[] args) throws InterruptedException {
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C://Program Files (x86)//Navtech//Navtech Charts//eCharts.EFB.App.exe");

		try {
			winDriver = new WiniumDriver(new URL("http://localhost:9999"), options);
		} catch (Exception e) {
			e.printStackTrace();
		}

		//WebDriverWait wait = new WebDriverWait(winDriver, 30);
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.name("MENU")));
		winDriver.findElementByName("MENU").click();
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.name("SETTINGS")));
		winDriver.findElement(By.name("SETTINGS")).click(); 
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.name("CANCEL")));
		winDriver.findElementByName("CANCEL").click();
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.name("MENU")));
		winDriver.findElementByName("MENU").click();
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.name("EXIT")));
		winDriver.findElement(By.name("EXIT")).click();
		 
	}

}
