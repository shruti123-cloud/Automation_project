package action_class;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import baseclass.Baseclass_1;

public class Class_002 extends Baseclass_1{

	public static void main(String[] args) {
		launch_browser("chrome");
   	 navigate_url("https://www.flipkart.com/");
   	 try {
			take_screenshot("Flipcart homepage");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   //locate search box
 driver.findElement(By.cssSelector("input.Pke_EE")).sendKeys("mobiles");
  //Action class-double click
  Actions act = new Actions(driver);
  try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 act.doubleClick(driver.findElement(By.cssSelector("input.Pke_EE"))).build().perform();
   	 
   	 
  
   	 
   	 
	}

}
