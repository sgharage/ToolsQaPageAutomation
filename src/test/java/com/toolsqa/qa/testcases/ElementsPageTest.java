package com.toolsqa.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.toolsqa.qa.base.TestBase;
import com.toolsqa.qa.pages.ElementCheckBoxPage;
import com.toolsqa.qa.pages.ElementsPage;

public class ElementsPageTest extends TestBase {

	ElementsPage ItemSelection;

	ElementsPageTest() {
		super();
	}

	@BeforeTest()
	// @Test(priority = 1)

	public void setup() {
		ElementPageInitialisation();
		ItemSelection = new ElementsPage();
	}

	@Test(priority = 2)
	public void validatePageImage() {
		boolean pageImage = ItemSelection.ValidatePageImage();
		Assert.assertTrue(true);
	}

	@Test(priority = 3)
	public void validateTextBoxMenu() {
		ItemSelection.validateTextBoxMenuSeletion();
	}

	@Test(priority = 4)
	public void validateCheckBoxMenu() {
		ItemSelection.validateCheckBoxMenuSelection();
	}

	@Test(priority = 5)
	public void validateRadioButtonMenu() {
		ItemSelection.validateRadioButtonMenuSelection();
	}

	@Test(priority = 6)
	public void validateWebTablesMenu() {
		ItemSelection.validateWebTablesMenuSelection();
	}

	@Test(priority = 7)
	public void validateButtonsMenu() {
		ItemSelection.validateButtonsMenuSelection();
	}

	@Test(priority = 8)
	public void validateLinksMenu() {
		ItemSelection.validateLinksMenuSelection();
	}

	@Test(priority = 9)
	public void validateBrokenLinksMenu() {
		ItemSelection.validateBrokenLinksMenuSelection();
	}

	@Test(priority = 10)
	public void validateUploadDownloadMenu() {
		ItemSelection.validateUploadDownloadMenuSelection();
	}
	
	@Test(priority = 11)
	public void validateDynamicPropertiesMenu() {
		ItemSelection.validateDynamicPropertiesMenuSelection();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
