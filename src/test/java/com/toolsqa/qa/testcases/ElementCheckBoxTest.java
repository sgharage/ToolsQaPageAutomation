package com.toolsqa.qa.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.toolsqa.qa.base.TestBase;
import com.toolsqa.qa.pages.ElementCheckBoxPage;

public class ElementCheckBoxTest extends TestBase {
	ElementCheckBoxPage InputDataCheckBox;

	ElementCheckBoxTest() {
		super();
	}

	@BeforeTest

	public void setup() {
		ElementCheckBoxInitialisation();
		InputDataCheckBox = new ElementCheckBoxPage();
	}

	@Test(priority = 1)

	public void PageHeader() {
		InputDataCheckBox.validatePageHeader();
	}
	
	@Test(priority = 2)
	public void expandButtonValidation()
	{
		InputDataCheckBox.validateExpandALL();
	}
	
	@Test(priority = 3)
	public void collapseButtonValidation()
	{
		InputDataCheckBox.validateCollapseALL();
	}

}
