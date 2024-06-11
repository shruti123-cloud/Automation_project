package java_collection_;

import java.util.ArrayList;
import java.util.LinkedList;

public class Array_list_001 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		 //add values
		names.add("Ashwini_1");
		names.add("vaibhav");
		names.add("nikhita");
		names.add("shruti");
		names.add("abhinnav");
		names.add("aakash");
		names.add("rahul");
		names.add("vaishnavi");
		names.add("ahawini_2");
		names.add("ashwani_3");
		names.add(null);
		names.add("");
		names.add("vaishnavi");
		names.add("abc");
	//add values with index
		names.add(12,"def");
		names.add(11, "ijk");
	//	names.add(20, "You");   exception comes order follow krte 

		//to print all values
		System.out.println(names);
		//print values with respect to index
		System.out.println(names.get(13));
		
		//remove values 
		//names.remove(13);
		//System.out.println(names);
		
		//to remove all values
		names.clear();
		System.out.println(names);
		
		//to check specific values
	System.out.println(names.contains("poonam"));
	System.out.println(names.contains("shruti"));
	//to get index
	System.out.println(names.indexOf("vaibhav"));
	//to get size
	System.out.println(names.size());
	//create copy
	System.out.println(names.clone());
	
	

	
		
		
		
		
		
		
		
		
	}

}
