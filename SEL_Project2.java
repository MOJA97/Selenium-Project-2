package com.seleniumProject2.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SEL_Project2 { 
	
											// 	BOOKING QUOTATION FOR INSURANCE

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Javed\\eclipse-workspace\\Selenium_Automation_Tool\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("Incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
		driver.manage().window().maximize();
		
		//email for login
		WebElement register = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
		register.click();
		
		// Filling details
		//password
		WebElement Title = driver.findElement(By.xpath("//select[@id='user_title']"));
		Title.click();
		Select s = new Select(Title);
		s.selectByValue("Master");
		
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("MOHAMMED");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='user_surname']"));
		lastName.sendKeys("JAVED");
		
		WebElement phonenumber = driver.findElement(By.xpath("//input[contains(@name,'phone')]"));
		phonenumber.sendKeys("9342374848");
		
		WebElement year = driver.findElement(By.xpath("//select[@name='year']"));
		year.click();
		Select s1 = new Select(year);
		s1.selectByValue("1990");
		
		WebElement month = driver.findElement(By.xpath("//select[@name='month']"));
		month.click();
		Select s2 = new Select(month);
		s2.selectByValue("6");
		
		WebElement date = driver.findElement(By.xpath("//select[contains(@name,'date')]"));
		date.click();
		Select s3 = new Select(date);
		s3.selectByVisibleText("9");
		
		WebElement provisional = driver.findElement(By.xpath("(//input[@name='licencetype'])[2]"));
		provisional.click();
		
		WebElement licencePeriod = driver.findElement(By.xpath("//select[@name='licenceperiod']"));
		licencePeriod.click();
		Select s4 = new Select(licencePeriod);
		s4.selectByValue("10");
		
		WebElement occupations = driver.findElement(By.xpath("//select[@name='occupation']"));
		occupations.click();
		Select s5 = new Select(occupations);
		s5.selectByVisibleText("Engineer");
		
		//Dynamic X-path
		//ancestor and following sibling
		WebElement address = driver.findElement(By.xpath("//input[@name='city']//ancestor::div[@class='newadd']//following-sibling::input[@name='street']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Greens Technology Adyar'", address);
		
		//ancestor and precedingsibling
		WebElement city = driver.findElement(By.xpath("//input[@type='text']//ancestor::div[@class='newadd']//preceding-sibling::input[@name='city']"));
		city.sendKeys("CHENNAI");
		
		//descendant
		WebElement country = driver.findElement(By.xpath("//div[@class='newadd']//descendant::input[@type='text'][3]"));
		country.sendKeys("INDIA");
		
		//Child
		WebElement pincode = driver.findElement(By.xpath("//div[@class='newadd']//child::div[4]//input[@name='post_code']"));
		pincode.sendKeys("600048");
		
		//following
		WebElement email = driver.findElement(By.xpath("//label[.='Email']//following::input[@name='email']"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].value='mojavedch@gmail.com'", email);
		
		//preceding
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("MOJA123.");
		
		WebElement CfrmPassword = driver.findElement(By.xpath("//div[@class='content']//descendant::div[@class='newadd']//descendant::input[@name='c_password']"));
		CfrmPassword.sendKeys("MOJA123.");
		
		
		Thread.sleep(6000);
		WebElement create = driver.findElement(By.xpath("//input[contains(@value,'Create')]"));
		create.click();
		
		WebElement emailLogin = driver.findElement(By.xpath("//input[@name='email']"));
		emailLogin.sendKeys("mojavedch@gmail.com");
		
		WebElement loginpassword = driver.findElement(By.xpath("//input[@type='password']"));
		loginpassword.sendKeys("MOJA123.");
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
		loginButton.click();
		
		WebElement requestQuotation = driver.findElement(By.xpath("//a[contains(text(),'Request Quotation')]"));
		requestQuotation.click();
		
		WebElement breakdowncover = driver.findElement(By.xpath("//select[@id='quotation_breakdowncover']"));
		breakdowncover.click();
		Select s6 = new Select(breakdowncover);
		s6.selectByValue("4");
		
		WebElement inputvalue = driver.findElement(By.xpath("//input[contains(@value,'Yes')]"));
		inputvalue.click();
		
		WebElement incidents = driver.findElement(By.xpath("//input[@name='incidents']"));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].value='NIL'", incidents);
		
		WebElement registration = driver.findElement(By.xpath("//input[@name='incidents']//following::h5[1]//child::input[@name='registration']"));
		registration.sendKeys("TN48 BJ9897");
		
		WebElement mileage = driver.findElement(By.xpath("//input[@name='mileage']"));
		mileage.sendKeys("10000 per year");
		
		WebElement estimatedValue = driver.findElement(By.xpath("//input[@name='value']"));
		estimatedValue.sendKeys("7,00,000 rupees");
		
		
		WebElement parkinglocation = driver.findElement(By.xpath("//select[@name='parkinglocation']"));
		parkinglocation.click();
		Select s7 = new Select(parkinglocation);
		s7.selectByVisibleText("Private Property");
		
		WebElement year1 = driver.findElement(By.xpath("//select[@name='year']"));
		year1.click();
		Select s8 = new Select(year1);
		s8.selectByVisibleText("2020");
		
		WebElement month1 = driver.findElement(By.xpath("//select[@name='month']"));
		month1.click();
		Select s9 = new Select(month1);
		s9.selectByVisibleText("June");
		
		WebElement day1 = driver.findElement(By.xpath("//select[@name='date']"));
		day1.click();
		Select s10 = new Select(day1);
		s10.selectByValue("9");
		
		
		WebElement savequotation = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		savequotation.click();
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Javed\\eclipse-workspace\\Selenium_Automation_Tool\\project_Screenshot\\project2.png");
		FileUtils.copyFile(src, dest);
		
		
		
	}

}
