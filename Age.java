import java.util.*;
import java.time.*;
public class Age
{
	public static void main(String args[])
	{ 	
		System.out.println("Enter birth date(yyyy-mm-dd format) : ");
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		LocalDate d=LocalDate.parse(st);
		LocalDate c=LocalDate.now();
		int age=Period.between(d,c).getYears();
		System.out.println("Age is : " + age);
	}
}