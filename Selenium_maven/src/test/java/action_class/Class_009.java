package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.Baseclass_1;

public class Class_009 extends Baseclass_1{

	public static void main(String[] args) {
launch_browser("chrome");
navigate_url("https://jqueryui.com/slider/");

//to enter inside frame
driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
//locate slider
WebElement slider = driver.findElement(By.cssSelector("div#slider"));
//slider move
Actions act = new Actions(driver);
//slider move to x axis 1st way
//act.dragAndDropBy(slider, 200, 0).build().perform();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//slider move in backward direction 1st 
//act.dragAndDropBy(slider, -100, 0).build().perform();
//slider move to x axis 2nd way
act.clickAndHold(slider).moveByOffset(100, 0).release().build().perform();
//slider move in backward direction 2nd
act.clickAndHold(slider).moveByOffset(-50, 0).release().build().perform();








	}

}
