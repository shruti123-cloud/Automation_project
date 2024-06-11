package java_control_statement;

public class Nested_if {

	public static void main(String[] args) {
		long l = 2000;
		if (l==2000) {
			System.out.println("number is equal to 2000");
	    if (l<3000) {
	    	System.out.println("number is less than 3000");
	    }if (l!=2000) {
	    	System.out.println("number is greater than 500");
	    }
		}else {
			System.out.println("all condition is false");
		}
	}

}
