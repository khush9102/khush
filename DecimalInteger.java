import java.util.*;
public class DecimalInteger
{
	public static void main(String args[])
	{
		System.out.println("Enter decimal number: ");
		Scanner s=new Scanner(System.in);
		double a=s.nextDouble();
		System.out.println("Integer number: " + (int)a);
	}
}