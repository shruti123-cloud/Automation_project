package exception;
//try catch block
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Class_002 {
	
	public void java() {
		try {
			FileInputStream fis = new FileInputStream("path");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
			
	}

}
