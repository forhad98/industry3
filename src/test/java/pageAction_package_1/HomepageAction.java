package pageAction_package_1;

import pageLocator_package_1.HomepageLocator;
import utility_package_1.Baseclass;

public class HomepageAction extends Baseclass {

	HomepageLocator homepageLocator = new HomepageLocator();
	public void allcategories() {
		homepageLocator.allcategories.click();
		
	}
	public void searchbutton() {
		homepageLocator.searchbutton.click();
		
	}
}
