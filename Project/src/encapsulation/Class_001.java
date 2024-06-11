package encapsulation;

public class Class_001 {
		private int i = 10000;
		private void hidemoney(int x) {
			i=x;  
			System.out.println(i);  
		}
		
	public static void main(String[] args) {
			Class_001 c = new Class_001();
			//c.hidemoney(90);
			c.hidemoney(3);
	}

}
