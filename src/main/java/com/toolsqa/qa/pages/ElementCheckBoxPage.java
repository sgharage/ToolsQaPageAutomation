package com.toolsqa.qa.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.toolsqa.qa.base.TestBase;

public class ElementCheckBoxPage extends TestBase {

	@FindBy(xpath = "//h1[text()='Check Box']")
	WebElement headerOfPage;
	
// expand and collapse button
	@FindBy(xpath = "//div[@class =\"rct-options\"]/button[1]")
	WebElement btnExpandAll;
	@FindBy(xpath = "//div[@class =\"rct-options\"]/button[2]")
	WebElement btnCollapseALL;

	public ElementCheckBoxPage() {
		PageFactory.initElements(driver, this);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}

	public void validatePageHeader() {
		String expectedHeaderText = "Check Box";
		String actualHeaderText = headerOfPage.getText().trim();

		System.out.println("Actual   Page Header text is:" + actualHeaderText);
		System.out.println("Expected page header text is:" + expectedHeaderText);

		Assert.assertEquals(expectedHeaderText, actualHeaderText, "Header text does not match!");
	}

	public void validateExpandALL() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(btnExpandAll));

		Assert.assertTrue(btnExpandAll.isDisplayed(), "Expand button not visible");
		Assert.assertTrue(btnExpandAll.isEnabled(), "Expand button not enabled");

		btnExpandAll.click();
		System.out.println("PASS: Expand button clicked after waiting.");

	}
	
	public void validateCollapseALL() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(btnCollapseALL));

		Assert.assertTrue(btnCollapseALL.isDisplayed(), "Expand button not visible");
		Assert.assertTrue(btnCollapseALL.isEnabled(), "Expand button not enabled");

		btnCollapseALL.click();
		System.out.println("PASS: Collapse button clicked after waiting.");

	}
	
}
