package com.toolsqa.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.toolsqa.qa.base.TestBase;
import com.toolsqa.qa.pages.DemoSitePage;

public class DemoSitePageTest extends TestBase {
	DemoSitePage menuSelection;

	public DemoSitePageTest() {
		super();
	}

	@BeforeTest
	public void setup() {
		DemoSiteinitialisation();
		menuSelection = new DemoSitePage();

	}

	@Test(priority = 1)
	public void pageTitle() {
		String titleOfPage = menuSelection.validatePageTitle();
		System.out.println("Title of page is: " + titleOfPage);
		Assert.assertEquals(titleOfPage, "DEMOQA");
	}

	@Test(priority = 2)
	public void pageImage() {
		boolean PageImage = menuSelection.validateImageOfPage();
		Assert.assertTrue(PageImage);
	}

	@Test(priority = 3)
	public void HeaderOfPage() {
		menuSelection.validateheaderOfPage();
	}

	@Test(priority = 4)
	public void ElementsMenu() {
		menuSelection.validateElementMenu();
	}
}
