package pattern;

public class Inverted_half_pyramid_rotate180 {

	public static void main(String[] args) {
			for(int i=1; i<=4; i++) {
				//print spaces
				for(int j=1; j<=4-i; j++) {
					System.out.print(" ");
				}
				//to print *
				for(int y=1; y<=i; y++) {
					System.out.print("*");
				}
				System.out.println();
			}
	}

}
