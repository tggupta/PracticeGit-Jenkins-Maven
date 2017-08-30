package com.org.learningMaven.PracticeGit_Jenkins_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {
		
	WebDriver driver=null;
	
	@Test
	public void getPractive() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tarun\\workspace\\PracticeGit-Jenkins-Maven\\src\\lib2\\chromedriver_new.exe");	
	driver=new ChromeDriver();
	
	driver.get("http://www.paytm.com");
	Thread.sleep(2000);
	driver.quit();
	}

}
