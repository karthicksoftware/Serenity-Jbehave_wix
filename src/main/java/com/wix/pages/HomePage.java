package com.wix.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.wix.com")
public class HomePage extends PageObject{
	
	By pageTitle = By.cssSelector(".page-title");
	By getStarted = By.xpath("//div[@class='inner']/*[text()='Get Started']");
	
	public HomePage(){
		if(getDriver() != null)
			getDriver().manage().window().maximize();
	}
	
	public void verifyGetStartedButton(){
		Assert.assertTrue("Get started button is not found", element(getStarted).isCurrentlyVisible());
	}
	
	public void verifyPageTitle(String expectedTitle){
		Assert.assertTrue("PageTitle text is mismatched", element(pageTitle).getText().equals(expectedTitle));
	}

}
