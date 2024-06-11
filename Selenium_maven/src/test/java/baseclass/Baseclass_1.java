package baseclass;    //dynamic code

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.module.Browser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Baseclass_1 {
	//static variable nd method use it
	public static WebDriver driver;
	public static String projectpath = System.getProperty("user.dir");

//Takes Screenshot method   //static method use for storing method
    	public static void takes_screenshot (String screenshotname) throws IOException {
	    TakesScreenshot ts = (TakesScreenshot) driver;	
	   File file = ts.getScreenshotAs(OutputType.FILE);
File Source_file = new File(projectpath+"\\Screenshot\\"+screenshotname+".png");
          FileHandler.copy(file, Source_file);
	}
	//Dynamic code launch browser
	public static void launch_browser(String browser) {
	ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notification");//fr notification disable 
		
		if(browser.equalsIgnoreCase("chrome")){
		driver = new ChromeDriver(options);
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			}
		else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	System.out.println("Launched Browser is:-"+browser);
	
		}
	//navigate url
	public static void navigate_url(String url) {
		driver.get(url);
		System.out.println("Navigate url:-"+url);
		System.out.println("The Title Of Webpage is:-"+driver.getTitle());
			
	}
		
	//screenshot
public static void take_screenshot(String Screenshotname) throws IOException {
	     TakesScreenshot ts = (TakesScreenshot) driver;
	  File target_file = ts.getScreenshotAs(OutputType.FILE);
	  File source_file = new File(projectpath+"\\Screenshot\\"+Screenshotname+".png");
	  FileHandler.copy(target_file, source_file);
}

//dynamic code scroll page
public static void scroll_page(int ypoints) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,"+ypoints+")");
}


	public static void main(String[] args) {
			
	
	}

}
