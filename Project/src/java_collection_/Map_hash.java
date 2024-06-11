package java_collection_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_hash {

	public static void main(String[] args) {
			HashMap<Integer, String> hm = new HashMap<Integer, String>();
			//add values
			hm.put(0,"ab");      	//maintains insertion order 1 2 5 6.....
			hm.put(1,"cd");
			hm.put(5, "gh");
			hm.put(6, "ef");
			hm.put(7, "ij");
			hm.put(8, "ij");
		//	hm.put(0, "kl");
			//to print values
			System.out.println(hm);
			//to remove value
			hm.remove(7);
			System.out.println(hm);
			hm.remove(5,"ef");
			System.out.println(hm);
			
			//to replace one value
			hm.replace(1, "xy");
			System.out.println(hm);
			hm.replace(7, "ij", "sk");
			System.out.println(hm);
			//to get value with respect to index
				System.out.println(hm.get(6));
				//to get size
				System.out.println(hm.size());
				//to search any key
				System.out.println(hm.containsKey(5));
				//to search any value
				System.out.println(hm.containsValue("bv"));
				//create duplicate copy
				System.out.println(hm.clone());
				//to remove all values
				System.out.println(hm);
			//to print all values using iterator
				//convert hashmap to set
        Set<Entry<Integer, String>> s = hm.entrySet();
	      Iterator<Entry<Integer , String>> it = s.iterator();
//set method  Set<Entry<Integer, String>> y = hm.entrySet();
 // iteartor method Iterator<Entry<Integer, String>> o = y.iterator();
				while(it.hasNext()) {
					  Map.Entry m = (Map.Entry)= it.next();
					  System.out.println();
				}
				
	
			

		
		
	}

}
