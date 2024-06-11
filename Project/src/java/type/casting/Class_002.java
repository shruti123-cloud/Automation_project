package java.type.casting;

public class Class_002 {

	public static void main(String[] args) {
		//narrowing casting
		long l = 2000;
		int x = (int)l;
		System.out.println(x); //output 2000
		System.out.println(l); // output 2000
		
		float f = 34.677f;
		long k = (long)f;
		System.out.println(k); //output 34
		System.out.println(f); // output 34.677
		
	}

}
