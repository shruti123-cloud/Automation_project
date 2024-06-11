package different_methods_of_webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_002 {

	public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.facebook.com");
    //current url
    System.out.println("current url is :-"+driver.getCurrentUrl());
    //get title
    System.out.println("Title of web page is :-"+driver.getTitle());
    //locate text box
    driver.findElement(By.cssSelector("input#email")).sendKeys("abc");
    //locate password
    driver.findElement(By.cssSelector("input#pass")).sendKeys("12");
    //clear email input
   driver.findElement(By.cssSelector("input#email")).clear();
    //clear password input
    driver.findElement(By.cssSelector("input#pass")).clear();
   //capture input of email
    
   
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
	}

}
