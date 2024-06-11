package different_methods_of_webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_003 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.facebook.com");
	    //current url
	    System.out.println("current url is :-"+driver.getCurrentUrl());
	    //get title
	    System.out.println("Title of web page is :-"+driver.getTitle());
WebElement link = driver.findElement(By.linkText("Forgotten password?"));
    //capture link name (get text)
      System.out.println("name of link is:-"+link.getText());
      //capture attribute
      System.out.println("Atrribute of an element is :-"+link.getAttribute("href"));
      link.click();
      
      
     
     
	        	}

}
