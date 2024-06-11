package method; // static method

public class Class_ {

	public static void main(String[] args) {
		//access by direct method
		//eat();
		girl();
		//access by class method
		//Class_.eat();
		Class_.girl();   
		//access by ref.variable(by class object)
		Class_ nd = new Class_();
		nd.eat();	
		nd.girl();
		
}
	//static method
	public static void eat() {
		System.out.println("i am eating");
		}
	public static void girl() {
		System.out.println("i am running");
	}


}
