package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelniumTest {
		public static void main(String[] args) {
			System. setProperty("webdriver.chrome.driver", "C:\\Users\\caf\\Documents\\TEST\\Automatisation\\chrome\\chromedriver_win32 (3)\\chromedriver.exe");
			WebDriver Driver=new ChromeDriver();
		    Driver.get("http://10.50.20.78:23820/AFNOR_uat/login.jsp");
		    Driver.manage().window().maximize();
		    Driver.findElement(By.id("login")).sendKeys("admin");
		    Driver.findElement(By.name("pwd")).sendKeys("Recette2017");
		    Driver.findElement(By.xpath("//*[@title=\"Valider\"]")).click();
		
		}
		
		
	
}
