package interface_;//child

public class Follow_traffic_rules implements Traffic_signal,AB_{

			public static void main(String[] args) {
			Follow_traffic_rules ftr = new Follow_traffic_rules();
			ftr.green();
			ftr.red();
			ftr.yellow();
			//interface object-directly
		//	Traffic_signal f = new Traffic_signal // cannot create object for interface
			//interface object-indirectly
			//Variables call
			Traffic_signal f = new Follow_traffic_rules();
			System.out.println(f.i);
			System.out.println(f.f);
			
			//interface cha reference var.(parent class property no.3)
			//use hot ahe current class cha object 
	}
	

	@Override
	public void green() {
		System.out.println("proceed with 60kmph");
	}

	@Override
	public void yellow() {
		System.out.println("proceed with 30 kmph");
	}

	@Override
	public void red() {
		System.out.println("stop here");
	}

//we can call multiple inheritance by using implements , 
	@Override
	public void get() {
		// TODO Auto-generated method stub
		
	}

}
