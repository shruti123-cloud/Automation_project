package action_class;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import baseclass.Baseclass_1;

public class Class_001 extends Baseclass_1{
						
     public static void main(String[] args) {
    	 launch_browser("chrome");
    	 navigate_url("https://www.flipkart.com/");
    	 try {
			take_screenshot("Flipcart homepage");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   WebElement link_grocery = driver.findElement(By.xpath("//span[text()='Grocery']"));

    	 //click on link - Actions class
    	 Actions act = new Actions(driver);
    	//act.click(link_grocery).build().perform();
    	//Locate fashion link - fashion
   WebElement link_fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
   //mouse hower
   
   act.moveToElement(link_fashion).build().perform();
   try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   try {
	take_screenshot("fashion");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   //link-home & furniture
   WebElement link_home_furniture = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
  //mouse hower
   act.moveToElement(link_home_furniture).build().perform();
   try {
	take_screenshot("link-home & furniture");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 //perform Right click
  act.moveToElement(link_home_furniture).contextClick();
  
  
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
  	
    	
    	 
    	 
    	 
	}

}
