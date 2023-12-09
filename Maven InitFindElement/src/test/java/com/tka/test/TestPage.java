package com.tka.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tka.log.LogPage;

public class TestPage {

	WebDriver driver = null;
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("file:///C:/Users/ADMIN/Desktop/JAVA%20SELENIUM/SELENIUM%20Notes/SELENIUM/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	    driver.manage().window().maximize();
	    
	    LogPage lp = new LogPage(driver);
	    lp.LoginTo("kiran@gmail.com", "123456");
	    
	    Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	
}
