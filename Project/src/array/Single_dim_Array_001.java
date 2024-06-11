package array;//single dim/1-d array
				//1)declare by allocating memory
//It is a container that stores the multiple values of same data type
public class Single_dim_Array_001 {

	public static void main(String[] args) {
			//declare by allocating memory
		// datatype arrayname []=new datatype [size]
		int[] mark = new int [6]; 
		  // int mark []=new int [6];
		  //  insert values
		mark[0]=35;
		mark[1]=34;
		mark[2]=45;
		mark[3]=67;
		mark[4]=98;
		mark[5]=56;
		
		//print array values
		System.out.println(mark[4]);
		System.out.println(mark[3]);
		System.out.println(mark[2]);
		System.out.println(mark[1]);
		System.out.println(mark[0]);
		System.out.println(mark[5]);
			//length of array
		System.out.println("length of mark:- "+mark.length);
System.out.println("length :-"+mark.length);
	
	}

}
