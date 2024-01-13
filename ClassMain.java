package project;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;

import javax.swing.Action;

import org.openqa.selenium.Keys;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;


class ClassMain extends BaseClass{
	
	@BeforeClass
	public static void beforeClass() {
		
		browserLaunch("chrome");
		urlLaunch("https://adactinhotelapp.com/index.php");
		maximize();
		implicitTime();
	}
	@AfterClass
	public static void afterClass() {
		
	

	}
	@BeforeMethod
	private void beforeMethod() {
		

	}
	@AfterMethod
	private void afterMethod() {
	
	}
	
	//@Parameters({"username","password"})
	@Test(priority = -3)
	private void test1() throws InterruptedException, AWTException {
		SoftAssert s1=new SoftAssert();
		s1.assertEquals("https://adactinhotelapp.com/index.php", currentUrl(),"Verify Url ");
		LoginPage lp=new LoginPage();
		moveToElement(lp.getTxtUSername());
		Robot r=new Robot();

		sendKey(lp.getTxtUSername(), "Dharanisri424");
		doubleClick(lp.getTxtUSername());
		contextClick(lp.getTxtUSername());
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		
		moveToElement(lp.getTxtPassword());
		contextClick(lp.getTxtUSername());
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
//		s1.assertEquals("Dharanisri424", getAttribute(lp.getTxtUSername(),"value"),"Verify Username ");
//		
//		sendKey(lp.getTxtPassword(), pwd);
//		s1.assertEquals( "Dharanisri424", getAttribute(lp.getTxtPassword(),"value"),"Verify Password ");
//
//		Thread.sleep(8);
//		click(lp.getBtnLogin());
//		s1.assertAll();
	}

//	@Parameters({"checkindate","checkoutdate"})
//	@Test(priority = 0)
//	private void test3(@Optional("09/01/2024")String checkindate,String checkoutdate) throws InterruptedException {
//		SoftAssert s1=new SoftAssert();
//		SearchHotelPage sh=new SearchHotelPage();	
//		selectByValue(sh.getCboLocation(),"Paris");	
//		s1.assertEquals("Paris", getAttribute(sh.getCboLocation(),"value"),"Verify location");
//	
//		selectByValue(sh.getCboHotel(),"Hotel Sunshine");
//		s1.assertEquals("Hotel Sunshine", getAttribute(sh.getCboHotel(),"value"),"Verify Hotel");
//		
//		selectByValue(sh.getCbRoomType(),"Standard");
//		s1.assertEquals("Standard", getAttribute(sh.getCbRoomType(),"value"),"Verify Room type");
//		
//		selectByValue(sh.getCbnoRooms(),"1");
//		s1.assertEquals("1", getAttribute(sh.getCbnoRooms(),"value"),"Verify Room no");
//		
//		sh.getDateCheckIn().clear();
//		sendKey(sh.getDateCheckIn(),checkindate);
//		s1.assertEquals("09/01/2024", getAttribute(sh.getDateCheckIn(),"value"),"Verify checkin date");
//		
//		sh.getDateCheckOut().clear();
//		sendKey(sh.getDateCheckOut(),checkoutdate);
//		s1.assertEquals("11/01/2024", getAttribute(sh.getDateCheckOut(),"value"),"Verify checkout time");
//		
//		selectByValue(sh.getCboAdult(),"2");
//		s1.assertEquals("2", getAttribute(sh.getCboAdult(),"value"),"Verify Adult no");
//		
//		selectByValue(sh.getCboChild(),"0");
//		s1.assertEquals("0", getAttribute(sh.getCboChild(),"value"),"Verify Child no");
//		
//		click(sh.getBtnSubmit());
//		
//		Thread.sleep(8);
//		s1.assertAll();
//	}
//	@Test(priority = 1)
//	private void test2() throws InterruptedException {
//		SoftAssert s1=new SoftAssert();
//		DetailsFilled3 df=new DetailsFilled3();
//		click(df.getRbSelect());
//		click(df.getBtnContinue());
//		Thread.sleep(8);
//		s1.assertAll();
//	}
//	@Test(priority = 2)
//	@Parameters({"firstnane","lastno","Address","Creditno","CvvNum"})
//	private void test4(String firstnane,String lastno,String Address,String Creditno,String CvvNum) throws InterruptedException {
//		SoftAssert s1=new SoftAssert();
//		PersonalDetailsSearch pd=new PersonalDetailsSearch();
//		sendKey(pd.getTxtFirstName(),firstnane);
//		s1.assertEquals("Madhumitha", getAttribute(pd.getTxtFirstName(),"value"),"Verify First Name");
//		
//		sendKey(pd.getTxtLastName(), lastno);
//		s1.assertEquals("kasiviswanathan", getAttribute(pd.getTxtLastName(),"value"),"Verify First Name");
//		
//		sendKey(pd.getTxtAddress(), Address);
//		s1.assertEquals("Palayapalayam,Erode", getAttribute(pd.getTxtAddress(),"value"),"Verify First Name");
//		
//		sendKey(pd.getTxtCreditno(), Creditno);
//		s1.assertEquals("0987654334561234", getAttribute(pd.getTxtCreditno(),"value"),"Verify First Name");
//		
//		selectByValue(pd.getCbCreditType(), "VISA");
//		s1.assertEquals("VISA", getAttribute(pd.getCbCreditType(),"value"),"Verify Credit no");
//		
//		selectByValue(pd.getMonthDropdown(), "8");
//		s1.assertEquals("8", getAttribute(pd.getMonthDropdown(),"value"),"Verify Month");
//		
//		selectByValue(pd.getYearDropdown(), "2029");
//		s1.assertEquals("2029", getAttribute(pd.getYearDropdown(),"value"),"Verify Year");
//		
//		sendKey(pd.getCvvNum(),CvvNum);
//		s1.assertEquals("9037", getAttribute(pd.getCvvNum(),"value"),"Verify CVV no");
//		
//		click(pd.getBtnBook());
//		Thread.sleep(5);
//		String orderno = getAttribute(pd.getTxtOrderno(), "value");
//		System.out.println("Order number: "+orderno);
//		Thread.sleep(8);       
//		s1.assertAll();
//	}
	
	
}
