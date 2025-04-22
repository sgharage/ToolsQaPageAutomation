package com.toolsqa.qa.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trial {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Step 1: Navigate to ToolsQA homepage
        driver.get("https://demoqa.com");

        try {
            // Step 2: Find the "Elements" card and click it
            WebElement elementsCard = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//h5[text()='Elements']/ancestor::div[@class='card mt-4 top-card']")));
            js.executeScript("arguments[0].scrollIntoView(true);", elementsCard);
            Thread.sleep(1000); // slight wait to let scroll complete
            elementsCard.click();

            // Step 3: Click "Text Box" in the sidebar
            WebElement textBoxItem = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//span[text()='Text Box']")));
            textBoxItem.click();

            // Optional: Add form interaction here (e.g., enter text into fields)

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Wait a bit and close
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
    }

//
}
