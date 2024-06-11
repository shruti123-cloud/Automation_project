package oops_concept_inheritance;//child

public class Class_d extends Class_c {
	public void y() {
		System.out.println("y method");
	}

	public static void main(String[] args) {
		//HAS-A relationship
		Class_c c=new Class_c();
		c.go();
		c.print();
		
		//parent class ref.variable hold child class objects
		Class_c c1 = new Class_d();
		c1.print();
		go();
		
		
		//property-4(does get error)
		//Class_d c2 = new Class_c();
		
		
	
		}

}
