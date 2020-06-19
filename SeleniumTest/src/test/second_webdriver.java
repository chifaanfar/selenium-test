package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class second_webdriver{
	
	 private WebDriver Driver;
	 
        @Before
		 
		public void beforTest(){ 
// OPEN  a URL
		 System. setProperty("webdriver.chrome.driver", "C:\\Users\\caf\\Documents\\TEST\\Automatisation\\chrome\\chromedriver_win32 (3)\\chromedriver.exe");
		 Driver= new ChromeDriver();
		 String URL="http://10.50.20.78:23820/AFNOR_uat/login.jsp?forwardPage=%2Fhome.fl";
		 Driver.get(URL);
		 
// Maximize the window	 
		     Driver.manage().window().maximize();
         
//Check the condition of title
         String ExistenceTitle=Driver.getTitle();
         String ExpectationTitle="S'IDENTIFIER";
         
         if(ExpectationTitle.equals(ExistenceTitle)) {
        	 
        	 System.out.println("Verification Successful");
        	 
         }
         
         else {
        	 System.out.println("Verification Unsuccessful");
         }
         
		}
        @Test
		
		public void Test(){
// Enter a valid login          
             
		 WebElement login = Driver.findElement(By.id("login"));
		 login.clear();
		 login.sendKeys("admin");
		 
// Enter a valid Pswrd
		 
		 WebElement password = Driver.findElement(By.id("pwd"));
		 password.clear();
		 password.sendKeys("Recette2017");
		 
//Press LOGIN BUTTON
		 
		 WebElement validation = Driver.findElement(By.xpath("//*[@title=\"Valider\"]"));
	     validation.click();
	     
	 
	     
// 	OPEN PM URL    
	     
	     WebElement PM = Driver.findElement(By.linkText("PP"));
	     PM.click(); 
	     WebElement RS= Driver.findElement(By.id("PerFld2"));
	     RS.sendKeys("Test");
	     Driver.findElement(By.id("search-MY_PERSON_")).click();
	     
	     
	 }
        @After
		public void AfterTest() {
			Driver.quit();
			
		}
	 }
	 
	 
	 
	 
	 
	 



