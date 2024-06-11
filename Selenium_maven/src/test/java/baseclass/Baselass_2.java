package baseclass;

import java.io.IOException;

public class Baselass_2 extends Baseclass_1 {
	
	public static void main(String[] args) {
		launch_browser("chrome");
		navigate_url("https://www.facebook.com/");
	try {
		takes_screenshot("Screenshot");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

		
	}


