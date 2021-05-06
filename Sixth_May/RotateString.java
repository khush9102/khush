import java.util.*;
public class RotateString
{
	public static void main(String args[])
	{
		int vow=0,con=0;
		System.out.println("Enter the first string: ");
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		System.out.println("Enter the second string: ");
		String str2=s.nextLine();
		if(str1.length()!=str2.length())
			System.out.println(str2 + " is not a rotation of " + str1);
		String str3=str1+str1;
		if(str3.contains(str2))
			System.out.println(str2 + " is a rotation of " + str1);
		else
			System.out.println(str2 + " is not a rotation of " + str1);
	}
}