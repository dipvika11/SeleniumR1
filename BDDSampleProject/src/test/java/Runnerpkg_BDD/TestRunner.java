package Runnerpkg_BDD;

import io.cucumber.testng.*;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(features="src/test/resources/Features",glue="StepsDef", tags="@chapter1",plugin= {"pretty","html:target/htmlreport.html","json:target/jsonreport.json"},monochrome=true)

public class TestRunner extends  AbstractTestNGCucumberTests{
	
	TestNGCucumberRunner testngcucumber = new TestNGCucumberRunner(this.getClass());

	
}
