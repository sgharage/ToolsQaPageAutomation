package com.toolsqa.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.toolsqa.qa.base.TestBase;
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
	
	

}
