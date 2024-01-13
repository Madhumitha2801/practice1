package project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"username\"]")
	private WebElement txtUSername;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//*[@id=\"login\"]")
	private WebElement btnLogin;

	@FindBy(xpath = "//*[@id=\"login_form\"]/table/tbody/tr[5]/td[2]/div/b/text()[1]")
	private WebElement invalid;
	
	public WebElement getTxtUSername() {
		return txtUSername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
}
