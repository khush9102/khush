import java.util.*;
public class SquareRoot
{
	public static void main(String args[])
	{
		double temp; 	
		System.out.println("Enter a number : ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		double sr=n/2;
		do
		{
			temp=sr;
			sr=(temp+(n/temp))/2;
		}
		while((temp-sr)!=0);
		System.out.println("The square root of " + n + " is " + sr);
	}
}