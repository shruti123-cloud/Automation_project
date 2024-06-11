package this_keyword;

public class This_004 {
	public void pen() {
		System.out.println("pen method from this_004");
	}
	public void pencil() {
		this.pen();
		System.out.println("pencil method from this_004");
		
	}

	public static void main(String[] args) {
		This_004 t4= new This_004();
		t4.pencil();
	}

}
