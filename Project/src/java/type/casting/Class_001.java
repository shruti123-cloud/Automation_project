package java.type.casting;
//type casting is when u assign a value one primitive data type to another type
public class Class_001 {

	public static void main(String[] args) {
			//WIDENING CASTING
		int i = 900;
		long l = i;
		System.out.println(l); //output 900
		System.out.println(i); //output 900
		
		int y = 400;
		double d= y;
		System.out.println(d); //output 400.0
		System.out.println(y); //output 400
	}

}
