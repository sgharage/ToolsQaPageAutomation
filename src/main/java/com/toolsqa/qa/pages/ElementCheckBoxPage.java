package com.toolsqa.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.toolsqa.qa.base.TestBase;

public class ElementCheckBoxPage extends TestBase {

	@FindBy(xpath = "//h1[text()='Check Box']")
	WebElement headerOfPage;

	public ElementCheckBoxPage() {
		PageFactory.initElements(driver, this);
	}

	public void validatePageHeader() {
		String expectedHeaderText = "Check Box";
		String actualHeaderText = headerOfPage.getText().trim();

		System.out.println("Actual   Page Header text is:" + actualHeaderText);
		System.out.println("Expected page header text is:" + expectedHeaderText);

		Assert.assertEquals(expectedHeaderText, actualHeaderText, "Header text does not match!");
	}
}
