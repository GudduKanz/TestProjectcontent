package Seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mygitclass {
	

		public static  WebDriver driver;

		public static  void  Browserfact() 
		{
			
			System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		        driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        driver.get("https://phptravels.com/");
		     	driver.manage().window().maximize();
		      

			}	 


	}


