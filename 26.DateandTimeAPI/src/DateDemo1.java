import java.util.Date;

public class DateDemo1 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Date d=new Date();
		System.out.println(d);
		Date d1=new Date(System.currentTimeMillis());
		System.out.println(d1);
		Date d2=new Date("1/1/2023");
		System.out.println(d2);
		System.out.println("Current Time in MilliSeconds : "+d.getTime());
		System.out.println("Date : "+d.getDate());
		System.out.println("Day : "+d.getDay());
		System.out.println("Month : "+d.getMonth());
		System.out.println(d.getYear()+1900+" <-Year ");
		System.out.println("GMT Time : "+d.toGMTString());
	}
}
