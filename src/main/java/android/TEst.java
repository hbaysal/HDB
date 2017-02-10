package android;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;

public class TEst extends AndroidSetup {
	@Test
	public void testTest() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.ca/");
		driver.findElement(By.id("lst-ib")).click();
		driver.findElement(By.id("lst-ib")).sendKeys("test");
		driver.quit();
	}
}
