package oops_concept_inheritance;		//child class
  //IS-A relationship

public class Class_b extends Class_a{
	double d=60.45;
	static long l = 80000;
	public void b() {
		System.out.println("b method");
	}

	public static void main(String[] args) {
		Class_b cb = new Class_b();
		System.out.println(cb.i);//class_a
		cb.get_data(); //class_a
		System.out.println(cb.d); //class_b
		cb.get();
		System.out.println(l);
	}

}
