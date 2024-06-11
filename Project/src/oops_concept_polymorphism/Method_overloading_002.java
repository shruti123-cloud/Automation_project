package oops_concept_polymorphism;

public class Method_overloading_002 {
		//public static void a(int a) {
			//System.out.println("a()method with int argument");
		//}
		public static void a(float f ) {
	System.out.println("a()method with float argument");
		}
		 public static void a(double d) {
	System.out.println("a()method with double argument");
}
		public static void a(long l) {
	System.out.println("a()method with long  argument");
}
		 public static void a() {
			 System.out.println("a()mthod with no argument");
		 }
		 public static void main(String[] args) {
			 a();
			a(12);
			//a(23.0098);
			//a(345.0080897f);
			
				
	}
}
