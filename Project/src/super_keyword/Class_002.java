package super_keyword;

public class Class_002 extends Class_001{
	public float f = 2.00f;
	public double d = 2.001;
	//super keyword
	public void get_variable() {
		//variable from parent class
		System.out.println(super.f);
	}

	public static void main(String[] args) {
			Class_002 s = new Class_002();
			s.get_variable();
		}

}
