package scanner_class;

import java.util.Scanner;

public class Class_003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any one  number");
					int input = sc.nextInt();
					System.out.println("table multiplicaion");

					for(int i = 1; i<=10 ; i++) {
						//System.out.println(i*input);
						//1*1=1
						System.out.println(input+"x" +i+" = "+(i*input));
						
					}
		
		
	}

}
