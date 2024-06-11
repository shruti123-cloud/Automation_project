package date.class_;

import java.util.Date;
//output- 30/04/2024  11:36:41
public class SimpleDateFormat {

	public static void main(String[] args) {
		//dd/m/yyyy hh:mm:ss
		Date d1 = new Date();
		//SimpleDateFormat sm = new simpledateformat("dd/mm/yyyy");
		//System.out.println(sm.format(d1));
		SimpleDateFormat sm = new SimpleDateFormat();
			System.out.println(sm.format(d1));
	}

}
