package this_keyword;

public class This_003 extends This_002 {
		String t = "ab";
		
		public void get_variable_value() {
			System.out.println(this.t);//this_003
			System.out.println(this.i);//this_002
			System.out.println(this.l);//this_002
		}
		
	public static void main(String[] args) {
		This_003 t3 = new This_003();
		t3.get_variable_value();
	}

}
