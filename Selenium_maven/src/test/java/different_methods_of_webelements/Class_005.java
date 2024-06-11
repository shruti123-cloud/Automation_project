package different_methods_of_webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_005 {

	public static void main(String[] args) {
 WebDriver driver = new FirefoxDriver();          
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   driver.get("https://www.amazon.in");
   //current url
 System.out.println("current url is :-"+driver.getCurrentUrl());
 //get title
  System.out.println("Title of web page is :-"+driver.getTitle());
    WebElement searchbox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
 //get location-x
    System.out.println("location with respect x-axis:-"+searchbox.getLocation().x);
  //get location-y
    System.out.println("location with respect y-axis:-"+searchbox.getLocation().y);   
   //get size
    System.out.println("size of searchbox is :-"+searchbox.getSize());
    
  
	}

}
