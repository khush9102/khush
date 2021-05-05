import java.util.*;
public class SwapNumber
{
	public static void main(String args[])
	{ 	
		System.out.println("Enter two numbers to swap: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Before swap: ");
		System.out.println("a=" + a + " and " + "b=" + b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swap: ");
		System.out.println("a=" + a + " and " + "b=" + b);
	}
}