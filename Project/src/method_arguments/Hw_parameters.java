package method_arguments;

public class Hw_parameters {
	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	
	  public void x (int n) {
		  a = n;
		  }
	  public void y (int m) {
		  b = m;
		  }
	  public void z (int o) {
		  c = o;
		  }
	  public void w (int p) {
		  d = p;
	  }
	  public void r(int l) {
		  e = l;
	  }
	  public void f(int m) {
		  f=m;
	  }
	  public void print () {
		  System.out.println("the value of instance variable a is:-"+a);
		  System.out.println("the value of instance variable b is:-"+b);
          System.out.println("the value of instance variable c is:-"+c);
          System.out.println("the value of instance variable d is:-"+d);
          System.out.println("the value of instance variable e is:-"+e);
          System.out.println("the value of instance variable e is:-"+f);
		  }
	  
	public static void main(String[] args) {
		Hw_parameters sk = new Hw_parameters();
		sk.x(23);
		sk.y(34);
		sk.z(4364);
		sk.w(45345);
		sk.r(1245667);
		sk.f(45566);
		sk.print();

	}

}
