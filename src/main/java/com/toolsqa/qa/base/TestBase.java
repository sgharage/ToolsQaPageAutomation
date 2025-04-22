package com.toolsqa.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.toolsqa.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static FileReader ip;

	public TestBase() {
		// code for read properties

		try {
			prop = new Properties();
			System.out.println("The Path is" + System.getProperty("user.dir"));
			FileInputStream ip = new FileInputStream((System.getProperty("user.dir")) + "\\src\\main\\java\\com\\"
					+ "toolsqa\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public static void initialisationMethod()
	{
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("ff")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
	}

	public static void initialisation() {
//		String browserName = prop.getProperty("browser");
//		if (browserName.equals("chrome")) {
//			driver = new ChromeDriver();
//		} else if (browserName.equals("ff")) {
//			driver = new FirefoxDriver();
//		}
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
		initialisationMethod();
		driver.get(prop.getProperty("url"));

	}
	
	public static void DemoSiteinitialisation() {
		initialisationMethod();
		driver.get(prop.getProperty("ElementMenuUrl"));

	}
	
	public static void ElementPageInitialisation()
	{
		initialisationMethod();
		driver.get(prop.getProperty("ElementPageUrl"));
	}

}
