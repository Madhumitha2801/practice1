package project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsFilled3 extends BaseClass {

	public DetailsFilled3() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(id="radiobutton_0")
	private WebElement rbSelect;
	
	@FindBy(id="continue")
	private WebElement btnContinue;

	public WebElement getRbSelect() {
		return rbSelect;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
	
	
}
