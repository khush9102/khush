import java.util.*;
public class LengthException
{
	public static void main(String args[]) throws LengthMatchException
	{
		System.out.println("Enter a string: ");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println("Enter the length of the string: ");
		int length=s.nextInt();
		try
		{
			if(str.length()!=length)
				throw new LengthMatchException();
			else
				System.out.println("Length of the string is same");
		}
		catch(Exception e)
		{
			System.out.println("Exception caught: " + e);
		}
	}
}
class LengthMatchException extends Exception
{
	LengthMatchException()
	{
		System.out.println("Length of the string is not same");
	}
}