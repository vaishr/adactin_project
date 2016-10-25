/**
 *   File Name: AdactinLogin.java<br>
 *
 *   Reddy, Vaishnavi<br>
 *   Created: Oct 24, 2016
 *   
 */

package com.sqa.vr.adactin;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

/**
 * AdactinLogin //ADDD (description of class)
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
public class AdactinLogin {
	private static WebDriver driver;
		
	@FindBy (id = "username")
	WebElement usernameFld;
	
	@FindBy (id = "password")
	WebElement passwordFld;
	
	@FindBy(id = "login")
	WebElement loginBtn;

public AdactinLogin(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public SearchHotel login(String username, String password) {
	usernameFld.clear();
	usernameFld.sendKeys(username);
	passwordFld.clear();
	passwordFld.sendKeys(password);
	loginBtn.click();
	return new SearchHotel(driver);
}

}