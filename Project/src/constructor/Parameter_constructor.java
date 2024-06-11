package constructor;

public class Parameter_constructor {
	//parameterized construtor
	public Parameter_constructor(int i,int r) {
		System.out.println(" parameterized constructor");
	}

	public static void main(String[] args) {
		Parameter_constructor c2 = new Parameter_constructor(78,56);
	}

}
