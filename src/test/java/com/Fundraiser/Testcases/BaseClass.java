package com.Fundraiser.Testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.Fundraiser.Utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;



//import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	ReadConfig rc=new ReadConfig();
	public String baseURL=rc.getApplicationURL();
	public String Email=rc.getusermail();
	public String password=rc.getPassword();
	public static WebDriver driver;
	
	public static Logger logger;
	@Parameters("browser")
	@BeforeClass
	public void setup(String br){
		
		logger=Logger.getLogger("Fundraiser");
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("chrome")){
		//WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", rc.getChromePath());
		WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(br.equals("firefox")){
			
			System.setProperty("webdriver.gecko.driver", rc.getFirefoxPath());
			driver=new FirefoxDriver();
		}
		
	}
	
	public void CaptureScreen(WebDriver driver,String tname) throws IOException{
		//initialize the TakesScreenshot class
		TakesScreenshot ts=(TakesScreenshot)driver;
		//store the file into source folder by using getScreenshot method
		File src= ts.getScreenshotAs(OutputType.FILE);
		//
		File target=new File("./Screenshots/"+tname+".png");
		
		FileUtils.copyFile(src, target);
		logger.info("screenshot is taken");
	}
	/*@AfterClass
	public void teardown(){
		driver.quit();
	}*/
}
