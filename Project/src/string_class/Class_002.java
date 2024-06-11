package string_class;

public class Class_002 {

	public static void main(String[] args) {
			String s = new String("java-Automation");
			String d = new String("how are you?");
			//to get index or position of characters
			System.out.println("index of characters is :-"+s.indexOf("m"));
			System.out.println("index is :-"+s.indexOf("o"));
			//to get substring(some characters)
			System.out.println("substring is :-"+s.substring(5));
			System.out.println("substring is :-"+s.substring(3,7));
			System.out.println("new string is :-"+s.substring(1, 9));
			//TO get characters with respect to index
			System.out.println(d.charAt(5));
			System.out.println(d.charAt(4));
	}

}
