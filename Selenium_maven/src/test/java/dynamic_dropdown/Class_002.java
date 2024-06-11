package dynamic_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.Baseclass_1;

public class Class_002 extends Baseclass_1{
      
	public static void main(String[] args) {
launch_browser("chrome");
 navigate_url("https://www.irctc.co.in/");
		    //locate from city  
WebElement from_city = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
 from_city.sendKeys("chandrapur");
		 //locate from city options   
 List<WebElement> from_city_options = driver.findElements(By.xpath("(//ul[@id='pr_id_1_list']//li)[2]"));
		  //choose one option from
 for(int i = 0; i <from_city_options.size(); i++ ) {
 if (from_city_options.get(i).getText().contains(" CHANDRAPUR - CD ")) {//or equal ignore case use
from_city_options.get(i).click();
			 }    
	}
System.out.println("entered from city is:-"+from_city.getAttribute("value"));
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//to city
WebElement to_city = driver.findElement(By.xpath("(//input[@role='searchbox'])[1]"));
to_city.sendKeys("nagpur");
//locate to city options   
List<WebElement> to_city_options = driver.findElements(By.xpath("(//ul[@id='pr_id_2_list']//li)[2]"));
//choose one option to       
for(int x = 0; x <to_city_options.size(); x++ ) {
	 if (to_city_options.get(x).getText().contains(" NAGPUR ROAD P H - NPRD ")) {//or equal ignore case use
		 to_city_options.get(x).click();
	 }
System.out.println("entered to city is:-"+to_city.getAttribute("value"));
           



}
}		
	}

