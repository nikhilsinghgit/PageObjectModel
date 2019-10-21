package com.crm.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {

	@Test
	public void testpage() {
		System.setProperty("webdriver.chrome.driver", "D:\\MISCELLANEOUS\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		String baseUrl = "https://www.google.com";
		wd.get(baseUrl);
	}

}
