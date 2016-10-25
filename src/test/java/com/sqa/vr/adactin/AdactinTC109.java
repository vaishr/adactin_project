/**
 *   File Name: AdactinTC109.java<br>
 *
 *   Reddy, Vaishnavi<br>
 *   Created: Oct 24, 2016
 *   
 */

package com.sqa.vr.adactin;

import org.openqa.selenium.*;
import org.testng.*;
import org.testng.annotations.*;

/**
 * AdactinTC109 //ADDD (description of class)
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
public class AdactinTC109 extends BasicTest {
	
	public AdactinTC109() {
		super("http://adactin.com/HotelAppBuild2");
	}
	
	@Test(dataProvider = "testData")
	public void testLogout(String locationInput, String hotelsInput, String roomTypeInput, String numOfRoomsInput,
			String checkInDateInput, String checkOutDateInput, String adultsPerRoomInput, String childrenPerRoomInput, String expectedRate) {
		new AdactinLogin(getDriver())
			.login("SQABCOct3", "sqaadmin2016")
			.search(locationInput, hotelsInput, roomTypeInput, numOfRoomsInput,
					checkInDateInput, checkOutDateInput, adultsPerRoomInput, childrenPerRoomInput);
		 String actualRate = getDriver().findElement(By.id("no_days_0")).getAttribute("value") + " - "
	                + getDriver().findElement(By.id("total_price_0")).getAttribute("value");
		Assert.assertEquals(actualRate, expectedRate);
	}
	
	@DataProvider
	public Object[][] testData() {
		return new Object[][] {
				{"Adelaide", "Hotel Hervey", "Standard", "3", "31/10/2016", "05/11/2016", "3", "4", "5 Days - AUD $ 2250"},
				{"New York", "Hotel Sunshine", "Deluxe", "5", "06/12/2016", "25/12/2016", "1", "2", "19 Days - AUD $ 35625"},
				{"Brisbane", "Hotel Creek", "Double", "3", "12/01/2017", "22/01/2017", "4", "1", "10 Days - AUD $ 6750"} };
	
	}
}
