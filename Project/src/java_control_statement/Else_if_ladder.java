package java_control_statement;

public class Else_if_ladder {

	public static void main(String[] args) {
		int i = 90;
		if (i>100) {
			System.out.println("condition -1");
		} else if(i<80||i>60) {
			System.out.println("condition-2");
			}else if (i==90) {
				System.out.println("condition-3");
			}else if(i<95) {
				System.out.println("condition -4");
			}
			else {
				System.out.println("all condition is false");
				
			}
	}

}
