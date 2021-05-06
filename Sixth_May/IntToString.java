import java.util.*;
public class IntToString
{
	public static void main(String args[])
	{
		System.out.println("Enter a number: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String a=Integer.toString(n);
		System.out.println("String is: " + a);
	}
}