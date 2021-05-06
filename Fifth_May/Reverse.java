import java.util.*;
public class Reverse
{
	public static void main(String args[])
	{
		int r=0;
		System.out.println("Enter a number to reverse: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n!=0)
		{
			int digit=n%10;
			r=r*10+digit;
			n=n/10;
		}
		System.out.println("Reversed number is: : " + r);
	}
}