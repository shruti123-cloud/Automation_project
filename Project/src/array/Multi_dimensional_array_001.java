package array;//1)declare by allocating memory//used to stores values of rows n coloumn

public class Multi_dimensional_array_001 {//-) rows   ! columns

	public static void main(String[] args) {
			//10 20 30
			//40 50 60
			//70 80 90
		int[][]number = new int[3][3];  //[rows 3][column 3]
		//insert values
		number[0][0]=10;
		number[0][1]=20;
		number[0][2]=30;
		number[1][0]=40;
		number[1][1]=50;
		number[1][2]=60;
		number[2][0]=70;
		number[2][1]=80;
		number[2][2]=90;
		System.out.println(number[1][2]);
		//System.out.println(number[0][2]);
		//print all values:- nested lop
		for(int i=0; i<3; i++) {
			//coloumn increment
			for(int j=0; j<3; j++) {
				System.out.print(number[i][j]+" ");
			}
			System.out.println();
		}
		


	}

}
