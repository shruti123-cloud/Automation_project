package data.types;

public class Methods {
	int u= 123344;
	   //instance method
      public void o() {
    	  System.out.println(u);
      }
       	public void b()  {	
		byte b =10;  //1 byte
		short c =23; //2 byte
		int d = 234;//4byte
		long t = 12346678l; // 8 byte
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(t);
       	}
       	public void dog() {
       		short s = 345;
       		System.out.println(s);
   	}
       	public void cat() {
       		System.out.println("she is very beautiful");
       	}
		
		public static void main(String[] args) {
			Methods m =new Methods();
			//Access instance method
			m.b();
			m.dog();
			m.cat();
			m.o();
			
		
		}

}
     
        







