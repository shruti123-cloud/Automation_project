package wrapper.class_;

public class Class_001 {

	public static void main(String[] args) {
		//convert primitive type to wrapper class
		int i = 4500;
		    Integer a = Integer.valueOf(i);
		System.out.println(a);
		float f = 3000.78f;
          Float v = Float.valueOf(f);
          System.out.println(v);
          
  		//convert wrapper class to primitive type
          Double d = new Double(5000.345);
              double pmt_dbl = d.doubleValue();
          System.out.println(pmt_dbl);
          

		
	}

}
