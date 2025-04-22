package com.toolsqa.qa.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.toolsqa.qa.base.TestBase;
import com.toolsqa.qa.util.TestUtil;

public class DemoSitePage extends TestBase {

	@FindBy(xpath = "//a[@href='https://demoqa.com']")
	WebElement pageLogo;

	@FindBy(xpath = "//div[@id = 'app']/descendant::img[1]")
	WebElement PageImage;
	
	@FindBy(xpath = "//div[@class = 'home-banner']/a")
	WebElement joinNow;

	@FindBy(xpath = "//h5[text()='Elements']/ancestor::div[@class='card mt-4 top-card']")
	WebElement ElementsPage;

	public DemoSitePage() {
		// Initializing page factory
		PageFactory.initElements(driver, this);

	}

	public String validatePageTitle() {
		return driver.getTitle();
	}

	public boolean validateImageOfPage() {
		return PageImage.isDisplayed();
	}
	
	public void validateheaderOfPage(){
		joinNow.click();
	}

// click on Elements Menu	
	public ElementsPage validateElementMenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// JavascriptExecutor js = (JavascriptExecutor) driver;

		try {
			// Step 2: Find the "Elements" card and click it
			wait.until(ExpectedConditions.elementToBeClickable(ElementsPage));

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			// js.executeScript("arguments[0].scrollIntoView(true);", ElementsPage);
			driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
			ElementsPage.click();
//          
//         // Step 3: Click "Text Box" in the sidebar
//            WebElement textBoxItem = wait.until(ExpectedConditions.elementToBeClickable(
//                    By.xpath("//span[text()='Text Box']")));
//            textBoxItem.click();
//
//            // Optional: Add form interaction here (e.g., enter text into fields)
//           // return new ElementsPage();
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.quit();

		return new ElementsPage();
		// return new ElementsPage();

	}
}
