package abstraction;

public class Class_002 extends Class_001 {
	@Override
	public void cd() {
			System.out.println("cd()from class_002");
		}
	
	@Override
	public void ef() {
		System.out.println("ef()from class_002");

	}
	public static void main(String[] args) {
				Class_002 c =new Class_002();
				c.cd();
				c.ef();
				c.xy();
				c.op();
				c.t();
	}

	@Override
	public void t() {
			System.out.println("shruuuu");
	}

	@Override
	public void cd1() {
		// TODO Auto-generated method stub
		
	}//this override comes from add unimplimented methods options
	

	
	
	
	


	

	

}
