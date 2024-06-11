package action_class;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.Baseclass_1;

public class Class_005 extends Baseclass_1{

	public static void main(String[] args) {
		//drag and drop another way 
		launch_browser("chrome");
		navigate_url("https://jqueryui.com/droppable/");
		try {
			take_screenshot("drag drop homepage");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   //locate frame
	WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	//to enter inside frame
	driver.switchTo().frame(frame);
	//locate drag element
	 WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
	//locate drop element
	 WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
	//action class
	 Actions act = new Actions(driver);
	
	//another way if 1st fail
 act.clickAndHold(drag).moveToElement(drop).release().build().perform();
 //to come out from frame
 driver.switchTo().defaultContent();//for come outside frame
 try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//click on link (dragable element click)
 driver.findElement(By.xpath("//a[text()='Draggable']")).click();
 
 
 

	}

}
