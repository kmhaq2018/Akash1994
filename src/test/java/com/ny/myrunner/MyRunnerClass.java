package com.ny.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	plugin ={"pretty","json:target/cucumber.json"},
	features= "Features/",
	glue = {"com.ny.spepdefinatinos"},
	monochrome= true,
	dryRun= false
	//strict = false,
   // tags="@Smoke"
		
)


public class MyRunnerClass extends   AbstractTestNGCucumberTests{

	
	
	
	
	
	
	
	
	
	
	
	
	
}
