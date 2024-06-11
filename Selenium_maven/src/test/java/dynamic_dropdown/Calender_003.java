package dynamic_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.Baseclass_1;

public class Calender_003 extends Baseclass_1{
public static String month_year;
	public static void main(String[] args) {
  launch_browser("chrome");
  navigate_url("https://www.railyatri.in/");
  //click on calender
 WebElement date_dropdown = driver.findElement(By.cssSelector("input#datepicker_train"));
 date_dropdown.click();
 
 while (true) {
	 //capture month and year
String month_year = driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();
if(!(month_year.equalsIgnoreCase("June 2024"))) {
	//click next button
	driver.findElement(By.xpath("(//th[@class='next'])[1]")).click();
}
else {
	break;
}}
 //select date
 driver.findElement(By.xpath("//td[text()='8']")).click();
 //capture selected month
 System.out.println("selected month is :-"+month_year);
//CAPTURE SELECTED date
 System.out.println("selected date is :-"+date_dropdown.getAttribute("value"));
 
	}

}
