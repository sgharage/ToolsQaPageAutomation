package com.toolsqa.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.toolsqa.qa.base.TestBase;

public class ElementsPage extends TestBase {
	@FindBy(xpath = "//a[@href='https://demoqa.com']")
	WebElement pageLogo;

	@FindBy(xpath = "//span[text()='Text Box']")
	WebElement textBoxMenu;

	@FindBy(xpath = "//span[text()= 'Check Box']")
	WebElement checkBoxMenu;

	@FindBy(xpath = "//span[text()= 'Radio Button']")
	WebElement radioButtonMenu;

	@FindBy(xpath = "//span[text()= 'Web Tables']")
	WebElement webTablesMenu;

	@FindBy(xpath = "//span[text()= 'Buttons']")
	WebElement ButtonsMenu;

	@FindBy(xpath = "//span[text()= 'Links']")
	WebElement LinksMenu;

	@FindBy(xpath = "//span[text()= 'Broken Links - Images']")
	WebElement BrokenLinksMenu;

	@FindBy(xpath = "//span[text()= 'Upload and Download']")
	WebElement UploadandDownloadMenu;

	@FindBy(xpath = "//span[text()= 'Dynamic Properties']")
	WebElement DynamicPropertiesMenu;

	public ElementsPage() {
		// Initializing page factory
		PageFactory.initElements(driver, this);
	}

	public boolean ValidatePageImage() {
		return pageLogo.isDisplayed();
	}

	public ElementTextBoxPage validateTextBoxMenuSeletion() {
		try {
			textBoxMenu.click();
			return new ElementTextBoxPage();
		} catch (Exception e) {
			System.out.println("Failed to click the button");
		}
		return new ElementTextBoxPage();
	}

	public ElementCheckBoxPage validateCheckBoxMenuSelection() {
		try {
			checkBoxMenu.click();
			return new ElementCheckBoxPage();
		} catch (Exception e) {
			System.out.println("Failed to click the button");
		}
		return new ElementCheckBoxPage();
	}

	public ElementCheckBoxPage validateRadioButtonMenuSelection() {
		try {
			radioButtonMenu.click();
			return new ElementCheckBoxPage();
		} catch (Exception e) {
			System.out.println("Failed to click the button");
		}
		return new ElementCheckBoxPage();
	}

	public ElementCheckBoxPage validateWebTablesMenuSelection() {
		try {
			webTablesMenu.click();
			return new ElementCheckBoxPage();
		} catch (Exception e) {
			System.out.println("Failed to click the button");
		}
		return new ElementCheckBoxPage();
	}

	public ElementCheckBoxPage validateButtonsMenuSelection() {
		try {
			ButtonsMenu.click();
			return new ElementCheckBoxPage();
		} catch (Exception e) {
			System.out.println("Failed to click the button");
		}
		return new ElementCheckBoxPage();
	}

	public ElementCheckBoxPage validateLinksMenuSelection() {
		try {
			LinksMenu.click();
			return new ElementCheckBoxPage();
		} catch (Exception e) {
			System.out.println("Failed to click the button");
		}
		return new ElementCheckBoxPage();
	}
	
	public ElementCheckBoxPage validateBrokenLinksMenuSelection() {
		try {
			BrokenLinksMenu.click();
			return new ElementCheckBoxPage();
		} catch (Exception e) {
			System.out.println("Failed to click the button");
		}
		return new ElementCheckBoxPage();
	}
	
	public ElementCheckBoxPage validateUploadDownloadMenuSelection() {
		try {
			UploadandDownloadMenu.click();
			return new ElementCheckBoxPage();
		} catch (Exception e) {
			System.out.println("Failed to click the button");
		}
		return new ElementCheckBoxPage();
	}
	
	public ElementCheckBoxPage validateDynamicPropertiesMenuSelection() {
		try {
			DynamicPropertiesMenu.click();
			return new ElementCheckBoxPage();
		} catch (Exception e) {
			System.out.println("Failed to click the button");
		}
		return new ElementCheckBoxPage();
	}
}
