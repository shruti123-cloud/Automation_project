package pattern;

public class Traingle_ {

	public static void main(String[] args) {
		/* 0-1 triangle
		 1
		 0 1
		 1 0 1
		 0 1 0 1
		 1 0 1 0 1    */
//		row +col=
		for(int i =1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				//row +col=
				int sum = i+j;
				
				if(sum%2==0) {
					System.out.print(" 1 ");
				}else {
					System.out.print(" 0 ");
				}
			}System.out.println();
		}
		
		
	}

}
