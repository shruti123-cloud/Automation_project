package non_access_modifiers;

public class Variables_001 {
	final int i= 10;
		public void a(int a) {
			//a=i;
			i=a;//(we cannot change value i value assigned permanently gives error)
			System.out.println(a);
		}
	public static void main(String[] args) {
		Variables_001 v = new Variables_001();
		v.a(2);
	}

}
