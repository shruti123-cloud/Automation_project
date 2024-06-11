package practice_control_statement_home;

public class Nested_if {

	public static void main(String[] args) {
			int i=20;
	
			if(i==30) {
				System.out.println("niku");
				if(i>40) {
					System.out.println("shru");
				}
				if(i>25||i<30) {
					System.out.println("bff");
				}
			}else {
				System.out.println("niku love shru");
			}
	}

}
