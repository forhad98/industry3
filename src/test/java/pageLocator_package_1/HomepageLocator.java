package pageLocator_package_1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility_package_1.Baseclass;

public class HomepageLocator extends Baseclass {

	public HomepageLocator() {
		
		PageFactory.initElements(driver, this);
	}
@FindBy(id="gh-cat")
public WebElement allcategories;
	
@FindBy(id="gh-btn")
public WebElement searchbutton;
	
}
