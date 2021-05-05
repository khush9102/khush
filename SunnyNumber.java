import java.util.*;
public class SunnyNumber
{
	public static void main(String args[])
	{ 	
		System.out.println("Enter a number : ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		double a=Math.sqrt(n+1);
		if((int)a==a)
			System.out.println(n + " is a sunny number");
		else
			System.out.println(n + " is not a sunny number");
	}
}