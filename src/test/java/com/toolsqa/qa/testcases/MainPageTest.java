package com.toolsqa.qa.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.toolsqa.qa.base.TestBase;
import com.toolsqa.qa.pages.MainPage;

public class MainPageTest extends TestBase {
	MainPage demositepage;

	public MainPageTest() {
		super();

	}

	@Test
	public void setup() throws InterruptedException {
		initialisation();
		demositepage = new MainPage();
	//	menuSelection = new MainPage();

	}

	@Test(priority = 1)
	public void demoPageTitleTest() {
		String title = demositepage.validatePageTitle();
		System.out.println("Expected Page title is:" + title);
		Assert.assertEquals(title, "Tools QA");

	}

	@Test(priority = 2)
	public void demoPageImageTest() {
		boolean flag = demositepage.validatePageImage();
		Assert.assertTrue(flag);

	}

	@Test(priority = 3)
	public void demoSiteMenuSelectionTest() throws InterruptedException {
		demositepage.validateDemoSiteMenu();
	}



	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
