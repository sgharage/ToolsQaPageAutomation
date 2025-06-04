package com.toolsqa.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.toolsqa.qa.base.TestBase;
import com.toolsqa.qa.pages.ElementTextBoxPage;

public class ElementTextBoxTest extends TestBase {
	ElementTextBoxPage InputData;

	ElementTextBoxTest() {
		super();
	}

	@BeforeTest
	public void setup() {
		ElementtextboxInitialisation();
		InputData = new ElementTextBoxPage();
	}

	@Test(priority = 1)
	public void validateNameInput() {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,500)");
		InputData.validateFullName();
		// Assert.assertTrue(true);
	}

	@Test(priority = 2)
	public void validateEmail() {
		InputData.validateEmail();
	}

	@Test(priority = 3)
	public void validateCurrentAddress() {
		InputData.validateCurrentAddress();
	}

	@Test(priority = 4)
	public void validatePermentAddress() {
		InputData.validatePermanentAddress();
	}

	@Test(priority = 5)
	public void validateSubmitButton() {
		InputData.validateSubmitButton();
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
