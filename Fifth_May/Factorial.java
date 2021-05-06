import java.util.*;
public class Factorial
{
	public static void main(String args[])
	{
		int fact=1;
		System.out.println("Enter a number to calculate factorial");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of " + n + " is " + fact);
	}
}