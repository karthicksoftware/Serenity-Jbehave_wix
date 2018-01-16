package com.wix.suite;

import java.util.Arrays;
import java.util.List;

import net.serenitybdd.jbehave.SerenityStories;

public class RunSuite extends SerenityStories{
	
	public RunSuite() {
		//super();
	}
	
	@Override
	public List<String> storyPaths() {
		return Arrays
				.asList(
						"stories/HomePage/HomePageTitle.story"
				);
	}

	@Override
	public void run() throws Throwable {
		super.run();
	}
}
