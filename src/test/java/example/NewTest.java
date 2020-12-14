package example;

import org.testng.annotations.Test;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NewTest {
	
	 public static final String USERNAME = "demotesting4";
	  
	 public static final String AUTOMATE_KEY = "j9hzk38LRuEQwB8coPqC";
	  
	 public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
  @Test
  public void f() throws Exception {
	  
	  		//System.setProperty("webdriver.chrome.driver", "/Users/bhagyesh/Downloads/chromedriver");
		
			//WebDriver driver = new ChromeDriver();
	  
	    DesiredCapabilities caps = new DesiredCapabilities();
	    
	    caps.setCapability("os", "Windows");
	   
	    caps.setCapability("os_version", "10");
	    
	    caps.setCapability("browser", "Chrome");
	    
	    caps.setCapability("browser_version", "80");
	    
	    caps.setCapability("name", "demotesting4's First Test");
	    
	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	 
			
			driver.manage().window().maximize();
			
			driver.get("https://www.amazon.com/");
			
			WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
			
			search.sendKeys("iPhone X");
			
			search.sendKeys(Keys.ENTER);
			
			WebDriverWait wait1 = new WebDriverWait(driver,20);
			
			WebElement ios = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"p_n_feature_twenty_browse-bin/17881878011\"]/span/a/span")));
			
			ios.click();
			
			/*
			WebDriverWait wait2 = new WebDriverWait(driver,20);
			
			WebElement done = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div/div[2]/span/span/span/button")));
			
			done.click();
			*/
			
			WebDriverWait wait3 = new WebDriverWait(driver,20);
			
			WebElement sortby = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.className("a-dropdown-prompt")));
			
			sortby.click();
			
			WebDriverWait wait4 = new WebDriverWait(driver,20);
			
			WebElement HightoLow = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.id("s-result-sort-select_2")));
			
			HightoLow.click();
			
			System.out.println("Name");
			
			
			try {
				
				WebDriverWait wait5 = new WebDriverWait(driver, 10);
				
				List<WebElement> names = wait5.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("a-size-medium")));
				
				for(WebElement webElement: names) {
					
				String temp = webElement.getText();
				
				System.out.println(temp); 
				
				}
				
				}
			
				catch(Exception e) { 
					
					System.out.println(e.getMessage());
				
				}
			
			
				System.out.println("Links");
			
				try {
				
				WebDriverWait wait5 = new WebDriverWait(driver, 10);
				
				List<WebElement> links = wait5.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[2]/div/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a")));
				
				for(WebElement webElement: links) {
					
				String temp = webElement.getAttribute("href");
				
				System.out.println(temp); 
				
				}
				
				}
			
				catch(Exception e) { 
					
					System.out.println(e.getMessage());
				
				}
				
				driver.quit();
			
			
	  
	  
	  
	  
	  
  }
}
