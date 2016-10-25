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
	public SearchHotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
