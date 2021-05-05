import java.util.*;
public class RandomNumber
{
	public static void main(String args[])
	{
		System.out.println("How many random numbers you want: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		Random r=new Random();
		for(int i=0;i<n;i++)
		{
			System.out.println("Random number " + i + " is " + r.nextInt());
		}
	}
}