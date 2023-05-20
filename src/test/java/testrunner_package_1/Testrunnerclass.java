package testrunner_package_1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import utility_package_1.Baseclass;

@CucumberOptions(features = {"/sec/test/resources/coldfile"},
plugin = {"json:target/cucumber.json"},
glue = "stepdefination_package_1")//tags = {"@Sanity"})

public class Testrunnerclass extends Baseclass {

@BeforeTest
public void ColdOpenUrl() {
	Baseclass test = new Baseclass();
	test.coldbrowser();
	
}
@AfterTest
public void ColCloseUrl() {
	Baseclass test = new Baseclass();
	test.driver.quit();
	
}

}
