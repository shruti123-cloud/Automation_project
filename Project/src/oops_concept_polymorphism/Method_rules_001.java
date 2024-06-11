package oops_concept_polymorphism;

public class Method_rules_001 {//about access modifier(1 rule)
	//only instance method can override
			void z() {
				System.out.println("z()method from method overriding");
			}
			//about non access(static) modifier(2 rule)
			//we cannot override static method
			public static void y() {
				System.out.println("y()method from method overriding");
			}
			
	public static void main(String[] args) {
			
	}

}
