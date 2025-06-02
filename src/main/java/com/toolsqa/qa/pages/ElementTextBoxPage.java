package com.toolsqa.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.toolsqa.qa.base.TestBase;

public class ElementTextBoxPage extends TestBase {
	@FindBy(id = "userName")
	WebElement nameTextBox;
	@FindBy(id = "userEmail")
	WebElement emailTextBox;
	@FindBy(id = "currentAddress")
	WebElement currentAddressTextBox;
	@FindBy(id = "permanentAddress")
	WebElement permanentAddressTextBox;
	@FindBy(id = "submit")
	WebElement btnSubmit;

	public ElementTextBoxPage() {
		// Initializing page factory
		PageFactory.initElements(driver, this);
		// WebElement nameTextBox = driver.findElement(By.id("userName"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
	}

	public void validateFullName() {
		if (nameTextBox.isDisplayed() && nameTextBox.isEnabled()) {
			nameTextBox.clear();
			nameTextBox.click();
			nameTextBox.sendKeys("ABC");
		} else {
			System.out.println("Textbox is either not visible or not enabled.");
		}

	}

	public void validateEmail() {
		if (emailTextBox.isDisplayed() && emailTextBox.isEnabled()) {
			emailTextBox.clear();
			emailTextBox.click();
			emailTextBox.sendKeys("Abc1_23@gmail.com");
		} else {
			System.out.println("Textbox is either not visible or not enabled.");

		}
	}

	public void validateCurrentAddress() {
		if (currentAddressTextBox.isDisplayed() && currentAddressTextBox.isEnabled()) {
			currentAddressTextBox.clear();
			currentAddressTextBox.click();
			currentAddressTextBox.sendKeys("Mumbai");
		} else {
			System.out.println("Textbox is either not visible or not enabled.");

		}
	}

	public void validatePermanentAddress() {
		if (permanentAddressTextBox.isDisplayed() && permanentAddressTextBox.isEnabled()) {
			permanentAddressTextBox.clear();
			permanentAddressTextBox.click();
			permanentAddressTextBox.sendKeys("Mumbai");
		} else {
			System.out.println("Textbox is either not visible or not enabled.");

		}
	}

	public void validateSubmitButton() {
		if (btnSubmit.isDisplayed()) {
			System.out.println("Button is Visible");
		} else {
			System.out.println("Button is not visisble");
		}

		if (btnSubmit.isEnabled()) {
			System.out.println("Button is Enable");
			btnSubmit.click();
		} else {
			System.out.println("Button is not Enable");
		}
	}
	
}
