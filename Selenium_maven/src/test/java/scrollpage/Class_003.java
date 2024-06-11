package scrollpage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import baseclass.Baseclass_1;

public class Class_003 extends Baseclass_1 {

	public static void main(String[] args) {
			launch_browser("chrome");
			navigate_url("https://www.facebook.com/");
			try {
				take_screenshot("fb homepage");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	//click on link
	System.out.println("click on forgot password");
	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	try {
		take_screenshot("After click on link");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//press back arrow
  JavascriptExecutor js = (JavascriptExecutor) driver;
  js.executeScript("window.history.back()");
  try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  js.executeScript("window.history.forward()");
  //click on refresh
   js.executeScript("window.history.go(0)")	;
	
			
	}

}
