package com.org.learningMaven.PracticeGit_Jenkins_Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class logingmaildynamic {

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
		
		driver.get(prop.getProperty("URL"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//*[@id='next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*/input[@id='Passwd' and @type='password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//*[@id='signIn']")).click();

    	WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='gbqfqwb']/table/tbody/tr/td")));
		System.out.println("Welcome to login page");
for(int i=0;i<3;i++)
{	
//searching of element		
		driver.findElement(By.xpath("//*[@id='gbqfab']/div/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*/input[@id=':l1' and @type='text']")).sendKeys("timesjobs job");
		driver.findElement(By.xpath("//*[@id='gbqfb']"));
		Thread.sleep(2000);
//selecting all searched emails
		WebElement checkAllEmails=driver.findElement(By.xpath("//*/span[@role='checkbox']/div"));
		checkAllEmails.click();
		System.out.println("Select all emails");
			if(checkAllEmails.isSelected()==true)
			{
				System.out.println("elements selected");
			}
			else
			{System.out.println("elements not selected");}

		System.out.println("Delete Button is visible");
		Thread.sleep(2000);
//deleting all searched emails		
		//driver.findElement(By.xpath("//*/div[@data-tooltip='Delete' and @aria-label='Delete']")).click();
		Thread.sleep(5000);
		System.out.println("emails deleted");
}	
		
	}
}
