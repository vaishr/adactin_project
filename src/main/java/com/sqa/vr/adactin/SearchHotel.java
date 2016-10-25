/**
 *   File Name: SearchHotel.java<br>
 *
 *   Reddy, Vaishnavi<br>
 *   Created: Oct 24, 2016
 *   
 */

package com.sqa.vr.adactin;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

/**
 * SearchHotel //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Reddy, Vaishnavi
 * @version     1.0.0
 * @since       1.0
 *
 */
public class SearchHotel {

	private static WebDriver driver;
	/**
	 * @param driver
	 */
	
    @FindBy(id = "adult_room")
    WebElement adultsPerRoom;
 
    @FindBy(id = "datepick_in")
    WebElement checkInDate;
 
    @FindBy(id = "datepick_out")
    WebElement checkOutDate;
 
    @FindBy(id = "child_room")
    WebElement childrenPerRoom;
 
    @FindBy(id = "hotels")
    WebElement hotels;
 
    @FindBy(id = "location")
    WebElement location;
 
    @FindBy(id = "room_nos")
    WebElement numOfRooms;
 
    @FindBy(id = "Reset")
    WebElement resetBtn;
 
    @FindBy(id = "room_type")
    WebElement roomType;
 
    @FindBy(id = "Submit")
    WebElement submitBtn;
 
	
	
	
	public SearchHotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
    public void search(String locationInput, String hotelsInput, String roomTypeInput, String numOfRoomsInput,
    			String checkInDateInput, String checkOutDateInput, String adultsPerRoomInput, String childrenPerRoomInput) {
	        Select locationSelect = new Select(this.location);
	        locationSelect.selectByVisibleText(locationInput);
	        
	        Select hotelsSelect = new Select(this.hotels);
	        hotelsSelect.selectByVisibleText(hotelsInput);
	        
	        Select roomTypeSelect = new Select(this.roomType);
	        roomTypeSelect.selectByVisibleText(roomTypeInput);
	        
	        Select numOfRoomsSelect = new Select(this.numOfRooms);
	        numOfRoomsSelect.selectByValue(numOfRoomsInput);
	        
	        this.checkInDate.clear();
	        this.checkInDate.sendKeys(checkInDateInput);
	        
	        this.checkOutDate.clear();
	        this.checkOutDate.sendKeys(checkOutDateInput);
	        
	        Select adultsPerRoomSelect = new Select(this.adultsPerRoom);
	        adultsPerRoomSelect.selectByValue(adultsPerRoomInput);
	        
	        Select childrenPerRoomSelect = new Select(this.childrenPerRoom);
	        childrenPerRoomSelect.selectByValue(childrenPerRoomInput);
	    }
	
}
