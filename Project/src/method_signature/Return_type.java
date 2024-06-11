package method_signature;
//it is a method name followed by paramter type
public class Return_type {
	//1 without return type and no parameter
	public void get_() {          
		System.out.println("shruu");
	}
	
	//2 without return type and parameter
	public void help_(long l) {
		System.out.println("niki");
	}	
	// 3 with return statement and no parameters
		public void get(){
			System.out.println("get method");
			return;
		}
		// 4 with return type and parameters
		public int get(int i){
			System.out.println("get method");
			return i ;
		}
		public int get_data(int o){
			System.out.println("get method with parameter");
			return 10 ;
		}
		public static String print(String name) {
			System.out.println("your name is :-"+ name);
			return name;
		}
		
			public static void main(String[] args) {
			print("shruti");
			
			Return_type c1 = new Return_type();
			c1.get_data(9);
			c1.get(1);
			c1.get_();
			c1.help_(4);
			c1.get(1);
	}

}
