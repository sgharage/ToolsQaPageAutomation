package com.toolsqa.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.toolsqa.qa.base.TestBase;

public class MainPage extends TestBase {

	// PageFactory
	@FindBy(xpath = "//ul[@class = \"navbar__links d-none d-lg-flex\"]/li[3]/a[text() = \"Demo Site\"]")
	WebElement demoSitemenu;

	@FindBy(xpath = "//img[contains(@class,'tools-qa-header__logo')]")
	WebElement toolsqaLogo;
	
	
//	@FindBy(xpath = "//h5[text()='Elements']/ancestor::div[@class='card mt-4 top-card']")
//	WebElement ElementsPage;

	public MainPage() {
		// Initializing page factory
		PageFactory.initElements(driver, this);

	}

//Actions
	public String validatePageTitle() {
		return driver.getTitle();

	}

	public boolean validatePageImage() {
		return toolsqaLogo.isDisplayed();
	}

	// click on Demo site Menu
	public DemoSitePage validateDemoSiteMenu() throws InterruptedException {
		demoSitemenu.click();

		return new DemoSitePage();
	}
	

}
