package oops_concept_polymorphism;//method overriding

public class Child_class_001 extends Parent_class_001 {
	public void	go(String S) {
		System.out.println("s()method from child class with string variables:-ab");
	}
	public void get() {
		System.out.println("get()method from parent class");
	}
	public static void main(String[] args) {
		Child_class_001 c = new Child_class_001();
		c.go("sk");
		//HAS-A relationship
		Parent_class_001 p = new Parent_class_001();
		p.go("niki");
		p.get();
		//property no.3
		Parent_class_001 p2 = new Child_class_001();
		p2.go("shruu");
		p2.get();
	}

}
