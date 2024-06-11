package non_access_modifiers;//method final- it restrict to override 
							//from parent class

public class Method_class_001 {
	
	public final void a() {
		
	}
	//static block
	//static-1st static block will call(execute) in console then only
	//methods will call(execute) disadv-main method cha adhi execute hote.
	
	
	static {
		System.out.println("static block");
	}
	public void xy() {
		System.out.println("m1 method");
	}
	public static void main(String[] args) {
				Method_class_001 m = new Method_class_001();
				m.xy();
				}

}
