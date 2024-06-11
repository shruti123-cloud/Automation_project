package file_uploading;
//robot class
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import baseclass.Baseclass_1;

public class Class_001 extends Baseclass_1 {

	public static void main(String[] args) {
launch_browser("chrome");
navigate_url("https://www.ilovepdf.com/word_to_pdf");
//click on upload file
driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
//to select desired file only copy
StringSelection s = new StringSelection("");//right click nd copy as path
// copy file location
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
//robot class
Robot r = new Robot();

r.delay(3000);

//press control v
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_V);
//release control v
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_V);
//press enter button
r.keyPress(KeyEvent.VK_ENTER);
//release enter button
r.keyPress(KeyEvent.VK_ENTER);









		
		
	}

}
