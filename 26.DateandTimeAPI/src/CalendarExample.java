
import java.util.*;

public class CalendarExample {

	public static void main(String[] args) {

		GregorianCalendar cal=new GregorianCalendar();
		System.out.println("MONTH : "+cal.get(Calendar.MONTH));
		System.out.println("DATE : "+cal.get(Calendar.DATE));
		System.out.println("DAY_OF_WEEK : "+cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("DAY_OF_YEAR : "+cal.get(Calendar.DAY_OF_YEAR));
		
		TimeZone tz=cal.getTimeZone();
		System.out.println("Time Zone Details : "+tz);
		System.out.println("Time Zone Name: " +tz.getDisplayName());
		System.out.println("Time Zone Id : "+tz.getID());
		cal.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		TimeZone tz1=cal.getTimeZone();
		System.out.println("Time Zone Id : "+tz1.getID());
		System.out.println("Time Zone Name: " +tz1.getDisplayName());
		
	}

}
