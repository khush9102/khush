import java.util.*;
public class MobileNumber
{
	public static void main(String args[])
	{
		System.out.println("Enter mobile number");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String regex="\\d{10}";
		boolean result=str.matches(regex);
		if(result)
			System.out.println("Mobile number is valid");
		else
			System.out.println("Mobile number is not valid");
	}
}