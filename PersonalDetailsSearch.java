package project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetailsSearch  extends BaseClass {

	public PersonalDetailsSearch() {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	@CacheLookup
	
	@FindBy(xpath="//*[@id=\"first_name\"]")
	private WebElement txtFirstName;
	
	@FindBy(xpath="//*[@id=\"last_name\"]")
	private WebElement txtLastName;
	
	@FindBy(xpath="//*[@id=\"address\"]")
	private WebElement txtAddress;
	
	@FindBy(xpath="//*[@id=\"cc_num\"]")
	private WebElement txtCreditno;
	
	@FindBy(xpath="//*[@id=\"cc_type\"]")
	private WebElement cbCreditType;
	
    @FindBy(xpath="//*[@id=\"cc_exp_month\"]")
	private WebElement monthDropdown;
    
	@FindBy(xpath="//*[@id=\"cc_exp_year\"]")
	private WebElement yearDropdown;
			
	@FindBy(xpath="//*[@id=\"cc_cvv\"]")
	
	private WebElement cvvNum ;
	
	@FindBy(xpath="//*[@id=\"order_no\"]")
	private WebElement txtOrderno;

	@FindBy(xpath="//*[@id=\"book_now\"]")
	private WebElement btnBook;
	
	
	public WebElement getBtnBook() {
		return btnBook;
	}
	
	
	public WebElement getTxtOrderno() {
		return txtOrderno;
	}
	
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCreditno() {
		return txtCreditno;
	}

	public WebElement getCbCreditType() {
		return cbCreditType;
	}

	public WebElement getMonthDropdown() {
		return monthDropdown;
	}

	public WebElement getYearDropdown() {
		return yearDropdown;
	}

	public WebElement getCvvNum() {
		return cvvNum;
	}
	
	
	
}
