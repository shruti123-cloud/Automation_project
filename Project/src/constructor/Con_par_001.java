package constructor;

public class Con_par_001 {
	
	public Con_par_001(double d,String s) {
		System.out.println("parameterized constructor with two parameter");
	}

	public static void main(String[] args) {
		Con_par_001 c3= new Con_par_001(35.09,"niki");
	}

}
