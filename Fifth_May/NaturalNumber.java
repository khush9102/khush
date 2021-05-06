import java.util.*;
public class NaturalNumber
{
	public static void main(String args[])
	{ 	
		int sum=0,i=1;
		System.out.println("Enter a number: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(i<=n)
		{
			sum+=i;
			i++;
		}
		System.out.println("sum of " + n + " natural number is : " + sum);        //usong a loop
		System.out.println("sum of " + n + " natural number is : " + n*(n+1)/2);  //without using a loop
	}
}
