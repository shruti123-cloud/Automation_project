package scrollpage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import baseclass.Baseclass_1;

public class Class_001 extends Baseclass_1 {

	public static void main(String[] args)  {
		launch_browser("chrome");
		navigate_url("https://www.jeevansathi.com/");
		try {
			take_screenshot("homepage_jeevansathi");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//scroll page
    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)");
		//take screenshot 
		try {
			take_screenshot("after page scroll");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//click facebook icon 
		driver.findElement(By.xpath("(//a[@target='_blank'])[1]")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//takescreenshot after click on facbook icon
		try {
			take_screenshot("after click on facebook link");
		} catch (IOException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				

	}

}
