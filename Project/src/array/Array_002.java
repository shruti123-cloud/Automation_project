package array;//2)declare without memory allocation

public class Array_002 {

	public static void main(String[] args) {
		String [] name = {"ab","cd","ef","gh","ij","kl"};
				//print values
		//indexing of array always start with zero
		System.out.println(name[0]);
		System.out.println(name[1]);
			System.out.println(name.length);
		//print all values of array
			//for each loop (enhanced loop)
			for(String s : name) {
				System.out.println(s);
				
				//print values using (for loop)
				//for (int i=0; i<6; i++) {
					//System.out.println(name[i]);}
			}
			
		
	}

	}
