package com.toolsqa.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQAFormTest {

	public static void main(String[] args) {
		 //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver();

	        try {
	            // Navigate to Tools QA website
	            driver.get("https://demoqa.com/");
	            driver.manage().window().maximize();

	            // Click on 'Elements'
	            WebElement elementsCard = driver.findElement(By.xpath("//h5[text()='Elements']/ancestor::div[@class='card mt-4 top-card']"));
	            elementsCard.click();

	            // Click on 'Text Box' from the sidebar
	            WebElement textBoxMenu = driver.findElement(By.id("item-0")); // or use xpath if necessary
	            textBoxMenu.click();

	            // Fill out the form
	            driver.findElement(By.id("userName")).sendKeys("John Doe");
	            driver.findElement(By.id("userEmail")).sendKeys("johndoe@example.com");
	            driver.findElement(By.id("currentAddress")).sendKeys("123 Main St, Anytown");
	            driver.findElement(By.id("permanentAddress")).sendKeys("456 Other St, Sometown");

	            // Click Submit
	            driver.findElement(By.id("submit")).click();

	            // Optional: Verify the result
	            WebElement output = driver.findElement(By.id("output"));
	            if (output.isDisplayed()) {
	                System.out.println("Form submitted successfully!");
	            } else {
	                System.out.println("Submission failed.");
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	}

}
