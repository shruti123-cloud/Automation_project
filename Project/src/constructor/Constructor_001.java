package constructor;//executes b.of.code whenever object is created for class

public class Constructor_001 {
	//constructor
	public Constructor_001() {
		System.out.println(" user defined constructor 001");
		System.out.println("user defined constructor 002");	}

	public static void main(String[] args) {
		Constructor_001 c1= new Constructor_001();
//Constructor_001  c2 = new Constructor_001();//defaultconstructor{everytime
	}									//	 object is created

}
