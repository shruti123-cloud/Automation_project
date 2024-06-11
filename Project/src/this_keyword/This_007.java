package this_keyword;

public class This_007 {
	public This_007() {
		System.out.println("constructor with no argument");
	}
	public This_007(String s) {
		this();//always write in 1st line in constructor
		System.out.println("constructor with one argument");
						
	}

	public static void main(String[] args) {
			This_007 t = new This_007("ab");
			
}

}
