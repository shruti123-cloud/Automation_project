package this_keyword;//this keyword is used to call instance variable

public class This_001 {
	String s;
	public void m1(String m) {
		//this keyword
		this.s=m;
		System.out.println(m);
		System.out.println(s);
		System.out.println(this.s);
	}

	

	public static void main(String[] args) {
		This_001 t= new This_001();
		t.m1("java");
	}

}
