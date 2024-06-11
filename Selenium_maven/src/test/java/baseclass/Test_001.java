package baseclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Test_001 extends Baseclass_1 {

	public static void main(String[] args)  {
     launch_browser("chrome");
     navigate_url("https://www.amazon.in/");
     //capture title and current url of web page
 System.out.println("The title of webpage is:-"+driver.getTitle());     
System.out.println("The current url is:-"+driver.getCurrentUrl());
  //Taking screenshot 
    try {
		takes_screenshot("amazon web page");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    System.out.println(" header section link:-amazon mini tv");
    driver.findElement(By.xpath("//a[text()='Amazon miniTV']")).click();
    //takes screenshot
    try {
		take_screenshot("amazon mini tv");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    //for back
  JavascriptExecutor js = (JavascriptExecutor) driver;
  js.executeScript("window.history.back()");
  //next link
    System.out.println("header section link:-sell");
    driver.findElement(By.xpath("//a[text()='Sell']")).click();
    try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   try {
	takes_screenshot("sell");
   } catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   //for back
   js.executeScript("window.history.back()");
   //next link
   System.out.println("header section link:-best sellers");
   driver.findElement(By.xpath("//a[text()='Best Sellers']")).click();
try {
	take_screenshot("Bestsellers");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
     //for back
   js.executeScript("window.history.back()");
	System.out.println("header section link:-mobiles");
  driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
  try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  try {
	take_screenshot("mobiles");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  //for back
  js.executeScript("window.history.back()");



    
    
	}

}
