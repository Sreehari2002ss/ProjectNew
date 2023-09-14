package org.basee;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static WebDriver browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;

	}
	
//	public static WebDriver browserLaunch(String bname) {
//		if(bname.equalsIgnoreCase("chrome")) {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		}
//		else if(bname.equalsIgnoreCase("edge"))
//		{
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//			
//		}
//		else
//		{
//			System.out.println("Invalid browser");
//		}
//		return driver;
		
//	}
	
	//public static WebDriver browserLaunch(String bname) {
//		switch(bname)
//		{
	//	case "chrome":
		//	WebDriverManager.chromedriver().setup();
			//driver = new ChromeDriver();
		//break;
		//case "edge":
			//WebDriverManager.edgedriver().setup();
			//driver =  new EdgeDriver();
			//break;
		//default:
			//System.out.println("Invalid Statement");
			
					
		
	//	}
		//	return driver;

//	}
	
	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}
	public static void implicitWait(int sec) {
		
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

	}
	public static void sendKeys(WebElement e, String value) {
		e.sendKeys(value);
	}
	public static void click(WebElement e) {
		e.click();

	}
	public static String currentUrl() {
	String currentUrl = driver.getCurrentUrl();
	return currentUrl;
	}
	
	public static String getTitle() {
		String title = driver.getTitle();
		return title;

	}
	
	public static void quit() {
		driver.quit();
	}
	public static String getText(WebElement e) {
		String text = e.getText();
		return text;
	}
	public static String getAttribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;
		
	}
	public static void accept() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	
	public static void dismiss() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}
	public static void alertSendKeys(WebElement e, String value) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(value);
	}
	
	public static String getTextAlert() {
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		return text;

	}
	public static void movetoElement(WebElement e) {
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();
	}
	public static void contextClick(WebElement e) {
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();
		a.contextClick().perform();
	}
	
	public static void clickAndHold(WebElement e) {
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();
		a.clickAndHold().perform();
	}
	public static void release(WebElement e) throws InterruptedException {
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();
		a.clickAndHold().perform();
		Thread.sleep(5000);
		a.release().perform();
	
	}
	public static void dragAndDrop(WebElement src,WebElement des)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(src, des).perform();
	
	}
	public static void selectbyIndex(WebElement e,int index) {
	Select s = new Select(e);
	s.selectByIndex(index);
	}
	public static void selectbyValue(WebElement e,String value) {
		Select s = new Select(e);
		s.selectByValue(value);
		}
	public static void selectbyText(WebElement e,String value) {
		Select s = new Select(e);
		s.selectByVisibleText(value);
		}
	public static void selectAll(WebElement e,int index) {
		Select s = new Select(e);
		List<WebElement> options = s.getOptions();
		for(int i = 0;i<options.size();i++)
		{
			s.selectByIndex(i);
		}
		}
	public static void deselectbyIndex(WebElement e,int index) {
		Select s = new Select(e);
		s.deselectByIndex(index);
		}
	public static void deselectbyValue(WebElement e,String value) {
		Select s = new Select(e);
		s.deselectByValue(value);
		}
	public static void deselectbyText(WebElement e,String value) {
		Select s = new Select(e);
		s.deselectByVisibleText(value);
		}
	public static void deselectAll(WebElement e,int index) {
		Select s = new Select(e);
		s.deselectAll();
	}
	public static void javaScriptSendkeys(WebElement e,String value) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value',value)", e);
	}
	
	public static void scrollDown(WebElement e,String value) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", e);
	}
	
	
	public static void scrollUp(WebElement e,String value) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", e);
	}
	
	public static void javaClick(WebElement e,String value) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", e);
	}
	public static void navigate(String value) {
		driver.navigate().to(value);

	}
	public static void forward() {
		driver.navigate().forward();
	}
	public static void back() {
		driver.navigate().back();

	}
	public static void refresh() {
		driver.navigate().refresh();

	}
	public static void isDisplayed(WebElement e,String value) {
		System.out.println("is displayed"+e.isDisplayed());
		

	}
	
	public static void isEnabled(WebElement e,String value) {
		System.out.println("is displayed"+e.isEnabled());
		

	}
	
	public static void isSelected(WebElement e,String value) {
		System.out.println("is displayed"+e.isSelected());
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
