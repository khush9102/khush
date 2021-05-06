import java.time.*;
public class DateTimeDefault
{
	public static void main(String args[])
	{
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println("Current date and time is: " + ldt);
	}
}