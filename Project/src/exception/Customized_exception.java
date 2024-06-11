package exception;

public class Customized_exception {
	
	public void number() {
		int i = 30;
		int r = i/2;
		System.out.println("hii");
		System.out.println(r);
		throw new ArithmeticException("number cant divide by 0");
	}
		
	public static void main(String[] args){
		Customized_exception c = new Customized_exception();
		c.number();
		
	}

}
