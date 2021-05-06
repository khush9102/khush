import java.util.*;
public class RoundDecimal
{
	public static void main(String args[])
	{
		System.out.println("Enter a number: ");
		Scanner s=new Scanner(System.in);
		float f=s.nextFloat();
		//int a=Math.round(f);
		String a=Float.toString(Math.round(f));
		System.out.println("Number after rundoff: " + a);
//		System.out.println(typeof(a));
	}
}