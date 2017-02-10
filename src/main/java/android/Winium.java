package android;

import java.net.URL;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class Winium {

	static WiniumDriver winDriver = null;

	@BeforeClass
	public static void setUp() {
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C://Program Files (x86)//Navtech//Navtech Charts//eCharts.EFB.App.exe");

		try {
			winDriver = new WiniumDriver(new URL("http://localhost:9999"), options);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testNotePad() {

		WebDriverWait wait = new WebDriverWait(winDriver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("MENU")));
		winDriver.findElementByName("MENU").click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("SETTINGS")));
		winDriver.findElement(By.name("SETTINGS")).click();
		// winDriver.findElementByName("New").sendKeys(Key.ENTER);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("CANCEL")));
		winDriver.findElementByName("CANCEL").click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("MENU")));
		winDriver.findElementByName("MENU").click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("EXIT")));
		winDriver.findElement(By.name("EXIT")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@AfterClass
	public static void tearDown() {
	}
}
