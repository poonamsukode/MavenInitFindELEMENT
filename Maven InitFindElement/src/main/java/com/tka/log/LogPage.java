package com.tka.log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogPage {

	WebDriver driver = null;
	public LogPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//initElement--@return An instantiated instance of the class with WebElement and List&lt;WebElement&gt;
        //there will be an element that can be located using the xpath expression "//*[@id='submit']" or
		//   * "//*[@name='submit']"
	}

	@FindBy(id="email")
	WebElement username;
	/*public WebElement getUsername() {
		return driver.findElement(By.id("email"));
	}*/

	  @FindBy(id="password")
	  WebElement password;
	/*public WebElement getPassword() {
		return driver.findElement(By.id("password"));
	}*/

	  @FindBy(xpath = "//button")
	  WebElement loginbtn;
	/*public WebElement getButton() {
		return driver.findElement(By.xpath("//button"));
	}*/
	
	public void LoginTo(String uname, String pass) {
	   username.sendKeys(uname);
	   password.sendKeys(pass);
	   loginbtn.click();
	}

}
