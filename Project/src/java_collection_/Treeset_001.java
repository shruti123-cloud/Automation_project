package java_collection_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Treeset_001 {

	public static void main(String[] args) {
	TreeSet<Integer> ts = new TreeSet<Integer>();
//	HashSet<String> g = new HashSet<String>();
//	LinkedHashSet<Float> p = new LinkedHashSet<Float>();
	//add values
	ts.add(10);ts.add(20);ts.add(30);ts.add(40);
	ts.add(50);ts.add(60);ts.add(70);ts.add(80);
	//to print all values
	System.out.println(ts);
	//to remove values
	ts.remove(70);
	System.out.println(ts);
	//to remove all values
	//ts.clear();
	System.out.println(ts);
	//to check specific value 
System.out.println(ts.contains(30));
//create duplicate
//System.out.println(ts.clone());
//to print values using iterator
           Iterator<Integer> t = ts.iterator();
           while (t.hasNext()) {
        	   System.out.println(t.next());
           }
    
           

	
	
	
	
	
	

	
	}

}
