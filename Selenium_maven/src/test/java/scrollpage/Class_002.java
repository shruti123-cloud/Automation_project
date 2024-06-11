package scrollpage;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;

import baseclass.Baseclass_1;

public class Class_002 extends Baseclass_1{

	public static void main(String[] args) {
		launch_browser("edge");
		navigate_url("https://www.railyatri.in/");
		try {
			take_screenshot("railyatri");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//scroll upto bottom
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
//take screenshot
try {
	take_screenshot("after scroll page at bottom");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

js.executeScript("window.history.back()");
         try {
			takes_screenshot("sk");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
	}

	
	

}
