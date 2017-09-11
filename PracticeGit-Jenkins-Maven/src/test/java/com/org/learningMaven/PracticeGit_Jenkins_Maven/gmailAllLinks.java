package com.org.learningMaven.PracticeGit_Jenkins_Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class gmailAllLinks {
	WebDriver driver=null;
	String path="C:\\Users\\Tarun\\Downloads\\PracticeGit-Jenkins-Maven\\PracticeGit-Jenkins-Maven\\src\\test\\gmailLogin";
	@Test
	public void testLogin() throws IOException, InterruptedException
	{
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fis);
		System.setProperty("webdriver.firefox.marionette", "user.path"+"\\lib\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.paytm.com");

		//List<WebElement> totallinks=driver.findElements(By.tagName("href"));
		List<WebElement> totallinks=driver.findElements(By.tagName("a"));
		int totallinks1=totallinks.size();
		System.out.println(totallinks1);
		 
		List list=driver.findElements(By.tagName("a"));
		System.out.println(list.size());

		for(int i=0;i<totallinks1;i++)
		{
			WebElement element=totallinks.get(i);
			String urlname=element.getAttribute("href");
			System.out.println(urlname);
		}
	}
}
