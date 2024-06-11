package method_arguments;

public class Parameters_hw {
	String s ;
	long l ;
	int j;
	int t;
	
	public void assign_value (String a, long b,int c,int r) {
		s = a;
		l =b;
		j=c;
		t=r;
		System.out.println(s);
		System.out.println(l);
		System.out.println(j);
		System.out.println(t);
		}
	public static void main(String[] args) {
		Parameters_hw p = new Parameters_hw();
                 p.assign_value("automation",132456l,333,23);
                 }

}
