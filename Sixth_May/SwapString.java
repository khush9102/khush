import java.util.*;
public class SwapString
{
	public static void main(String args[])
	{
		System.out.println("Enter the first string: ");
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		System.out.println("Enter the second string: ");
		String str2=s.nextLine();
		System.out.println("Before swapping: ");
		System.out.println("First string: " + str1);
		System.out.println("Second string: " + str2);
		str1=str1+str2;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.println("After swapping: ");
		System.out.println("First string: " + str1);
		System.out.println("Second string: " + str2);
	}
}