package test;

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



public class junitTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    System. setProperty("webdriver.chrome.driver", "C:\\Users\\caf\\Documents\\TEST\\Automatisation\\chrome\\chromedriver_win32 (3)\\chromedriver.exe");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void edaljunit() {
    driver.get("http://10.50.20.78:23820/AFNOR_uat/login.jsp?forwardPage=%2Fhome.fl");
    driver.manage().window().setSize(new Dimension(978, 763));
    driver.findElement(By.id("login")).sendKeys("admin");
    driver.findElement(By.id("pwd")).sendKeys("Recette2017");
    driver.findElement(By.cssSelector("#loginContainer > .buttoninputLogin")).click();
    driver.close();
  }
}
