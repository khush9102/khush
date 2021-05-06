import java.util.*;
import java.text.*;
public class DateTimePattern
{
	public static void main(String args[])
	{
		DateFormat df=new SimpleDateFormat("dd:MM:YYYY hh:mm:ss");
		Date d=new Date();
		System.out.println("Current date and time is: " + df.format(d));
	}
}