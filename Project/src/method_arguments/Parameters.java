package method_arguments;

public class Parameters {
	//instance variable
	int i;
	int s;
	
	//instance method 
	public void assign_value (int a) {
		//assign value to instance variables
		i = a;
		
		System.out.println(i);	
	}
	public void dog(int h) {
		s=h;
		System.out.println(s);
	}
	public static void main(String[] args) {
		Parameters sk = new Parameters ();
           sk.assign_value(123);
				sk.dog(343);
		
     	}

}
