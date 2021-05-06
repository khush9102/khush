import java.util.*;
public class Prime
{
	public static void main(String args[])
	{
		int flag=0;
		System.out.println("Enter a number: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n==0||n==1)
		{
			System.out.println(n + "is not a prime number");
		}
		else
		{
			for(int i=2;i<=n/2;++i)
			{
				if(n%i==0)
				{
					System.out.println(n + "is not a prime number");
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(n + "is a prime number");
			}
		}
	}
}