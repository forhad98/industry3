package stepdefination_package_1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageAction_package_1.HomepageAction;
import utility_package_1.Baseclass;

public class coldfile extends Baseclass  {
	 HomepageAction  homepageAction = new  HomepageAction();
	
	
	@Given("^openn ebay \"([^\"]*)\" app$")
	public void openn_ebay_app(String URL) throws Throwable {
	   coldurl(URL);
	}

	@Then("^click all categories$")
	public void click_all_categories() throws Throwable {
		 homepageAction.allcategories();
	}

	@Then("^click search button$")
	public void click_search_button() throws Throwable {
		homepageAction.searchbutton();
	}



}
