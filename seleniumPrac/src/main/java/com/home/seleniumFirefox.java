package com.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumFirefox {

	/*
	 * public static void main1(String[] args) {
	 * 
	 * System.setProperty("webdriver.gecko.driver", "geckodriver.exe"); WebDriver
	 * driver = new FirefoxDriver();
	 * 
	 * driver.get("http://demo.guru99.com/selenium/guru99home/"); }
	 */
	
	public static void main(String[] args) {

		 WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/");
		
		System.out.println("Browser Title is " +driver.getTitle());
		driver.quit();
	}
	
	

}
