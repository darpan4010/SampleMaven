package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pages {

	
	public Pages(WebDriver driver) {
		super();
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(text(),'REGISTER')]")
	public WebElement ele;
}
