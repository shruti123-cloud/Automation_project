package operaters;

public class Logical_operators {

	public static void main(String[] args) {
		int i = 9;
		int a = 20;
		int s = 2;
		//logical and
		System.out.println(i<15&&a>10);
		System.out.println(i>5&&a<200);
		System.out.println(a>5&&s<5);
		
		float f = 20.7f;
		double d = 100.78;
		//logical or
		System.out.println(f<10||d>500);
		System.out.println(f>10||d<500);
		
		
		long l = 3000;
		long j = 5000;
		int g = 23;
		//logical not 
		System.out.println(!(l==2000&&j>7000));
		System.out.println(!(l==3000&&j<7000));
		System.out.println(!(g==23||g<2));
		
	}
		

}
