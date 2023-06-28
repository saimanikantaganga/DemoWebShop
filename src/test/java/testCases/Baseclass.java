package testCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Baseclass {
	public static WebDriver driver;
	ResourceBundle rb = ResourceBundle.getBundle("config");;
	
	
	@BeforeTest(groups = {"Master","Regression","Sanity"})
	//@Parameters("browser")
	public void setUpBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(rb.getString("url"));
//		if(browser.equals("chrome"))
//		{
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			driver.get(rb.getString("url"));
//		}
//		else if(browser.equals("edge"))
//		{
//			driver = new EdgeDriver();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			driver.get(rb.getString("url"));
//		}
//		else if(browser.equals("firefox"))
//		{
//			driver = new FirefoxDriver();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			driver.get(rb.getString("url"));
//		}
	}
	
	@AfterTest(groups = {"Master","Regression","Sanity"})
	public void quit() {
		//driver.quit();
	}
	
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("C:\\Users\\MGANGA\\eclipse-workspace\\DemoWebShop\\screenshots" + tname + "_" + timeStamp + ".png");

		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;

	} 

}
