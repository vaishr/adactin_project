/**
 *   File Name: SelectHotel.java<br>
 *
 *   Reddy, Vaishnavi<br>
 *   Created: Oct 24, 2016
 *   
 */

package com.sqa.vr.adactin;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

/**
 * SelectHotel //ADDD (description of class)
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
public class SelectHotel {
	
	private static WebDriver driver;
	/**
	 * @param driver
	 */
	
	public SelectHotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
}
