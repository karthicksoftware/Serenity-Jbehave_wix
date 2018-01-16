package com.wix.steps;

import com.wix.pages.HomePage;

import net.thucydides.core.annotations.Step;

public class HomePageSteps {
	
	HomePage homePage;

	@Step
	public void open_browser(){
		homePage.open();
	}
	
	@Step
	public void verify_get_started_button_is_visible(){
		homePage.verifyGetStartedButton();
	}
	
	@Step
	public void verify_the_title_of_the_homepage(String expectedTitle){
		homePage.verifyPageTitle(expectedTitle);
	}
}
