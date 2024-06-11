package string_class;

public class Class_003 {
	private static final int e = 0;
	//private static final int l = 0;
	String s = "Nagpur";
	String r = "wardha";
	public static String p = " chandrapur";
	String h = "";
	String t =" rose";
	static String m = " given ";
	public void get_string(int v) {
		//to add another string in given string
		System.out.println(s.concat(" is orange city"));
		System.out.println(s+" is big city");
		//to make string in lower case
		System.out.println(s.toLowerCase());
		//To make string in upper case
		System.out.println(r.toUpperCase());
		//to remove beginning and ending space from string
		System.out.println(p.trim());
		System.out.print("cd");//to print in one line 
		//to check string empty or not
		System.out.println();
		//to check string empty or not
		System.out.println(h.isEmpty());
		System.out.println(t.isEmpty());
		//to check characters which is present or not-
		System.out.println(m.contains("i"));
		System.out.println(m.contains("p"));
		System.out.println(m.contains("gi"));//true bec.seq.line wise
		System.out.println(m.contains("gv"));//false bec. sequence not line wise  
		//to compare two string which is equal or not
		String a = "ab";
		String b = "cd";
		System.out.println(a.equals(b));
		System.out.println(a.equals("ab"));
		System.out.println(a.equals("a"));
		//to ignore case b/t two string
		String ab = "TRAIN";
		String xy = "train";
		System.out.println(ab.equalsIgnoreCase(xy));
		System.out.println(ab.equalsIgnoreCase(ab));
		//to check ending character of string
		String op = "sunday";
		System.out.println(op.endsWith("ay"));
		System.out.println(op.endsWith("k"));
		//to print character in forward direction //y o u
		String m = "you will do great.!";
		//y o u
		for(int r= 0; r<=m.length(); r++);{
		System.out.print(m.charAt(e)+" " );
		
		}		//to print characters in 
	}

	public static void main(String[] args) {
		Class_003 n = new Class_003();
		n.get_string(1);
	}

}
