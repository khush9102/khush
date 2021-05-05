import java.util.*;
public class Factors
{
	public static void main(String args[])
	{ 	
		System.out.println("Enter a number to find factors: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("Factors of " + n + " are :");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.print(i + " ");
		}
	}
}