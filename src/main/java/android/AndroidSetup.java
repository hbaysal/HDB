package android;

import java.io.IOException;
import java.net.URL;

import org.junit.runner.JUnitCore;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidSetup {

	public static AndroidDriver<?> driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		try {
			DesiredCapabilities caps = new DesiredCapabilities(); //
			caps.setCapability("app", "Chrome"); //
			caps.setCapability(MobileCapabilityType.BROWSER_NAME, "");
			caps.setCapability("browserName", "Chrome");
			caps.setCapability(CapabilityType.VERSION, "5.0.1");
			caps.setCapability("platformName", "Android");
			caps.setCapability("deviceName", "4d00d8f126d270c9");
			driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
			System.out.println(driver);
			JUnitCore core = new JUnitCore();
			core.run(TEst.class);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
