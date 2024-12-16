package com.zenhotels.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zenhotels.pages.BasePage;
import com.zenhotels.pages.BookingPage;

public class BookingTest extends BasePage {
	
	BookingPage bookingpage;
	
	@BeforeMethod
	public void setUp() {
		bookingpage = new BookingPage(driver);
		driver.get("https://www.zenhotels.com/?sid=b7e73d90-0c60-4a08-bd82-79278b0b426f");
	}
	
	@Test
	public void bookingProcess() {
		 bookingpage.searchHotel("London, United Kingdom");
	        bookingpage.setCheckInDate("2024-12-25"); 
	        bookingpage.setCheckOutDate("2024-12-28"); 
	        bookingpage.selectGuests("1"); 
	        bookingpage.selectLeisureTrip();
	        bookingpage.clickSearchButton();
	        bookingpage.selectHotel();
	        bookingpage.showRooms();
	        bookingpage.selectRoom();
	        bookingpage.enterEmail("gankidirahul123@gmail.com"); 
	        bookingpage.enterLastName("Reddy"); 
	        bookingpage.enterFirstName("Rahul");
	        bookingpage.enterPhoneNumber("447733643203"); 
	        bookingpage.enterCitizenship("United Kingdom"); 
	        bookingpage.selectArrivalTime("15:00"); 
	        bookingpage.clickContinue();
	    }
	
@AfterMethod
public void tearDown() {
}
}

