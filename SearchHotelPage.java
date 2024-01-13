package project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBy(xpath = "//*[@id=\"location\"]")
	private WebElement cboLocation;
	
	@FindBy(xpath = "//*[@id=\"hotels\"]")
	private WebElement cboHotel;
	
	@FindBy(xpath = "//*[@id=\"room_type\"]")
	private WebElement cbRoomType;
	
	@FindBy(xpath = "//*[@id=\"room_nos\"]")
	private WebElement cbnoRooms;
	
	@FindBy(xpath="//*[@id=\"datepick_in\"]")
	private WebElement dateCheckIn;
	
	@FindBy(xpath="//*[@id=\"datepick_out\"]")
	private WebElement dateCheckOut;
	
	
	@FindBy(xpath="//*[@id=\"adult_room\"]")
	private WebElement cboAdult;
	
	@FindBy(xpath="//*[@id=\"child_room\"]")
	private WebElement cboChild;
	
	@FindBy(id="Submit")
	private WebElement btnSubmit;

	public WebElement getCboLocation() {
		return cboLocation;
	}

	public WebElement getCboHotel() {
		return cboHotel;
	}

	public WebElement getCbRoomType() {
		return cbRoomType;
	}

	public WebElement getCbnoRooms() {
		return cbnoRooms;
	}

	public WebElement getDateCheckIn() {
		return dateCheckIn;
	}

	public WebElement getDateCheckOut() {
		return dateCheckOut;
	}

	public WebElement getCboAdult() {
		return cboAdult;
	}

	public WebElement getCboChild() {
		return cboChild;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	
	
}


