import java.util.*;
public class VowCon
{
	public static void main(String args[])
	{
		int vow=0,con=0;
		System.out.println("Enter a string: ");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
				vow++;
			else if((ch>='a' && ch<='z' || ch>='A' && ch<='Z'))
				con++;
		}
		System.out.println("Number of vowels in a string is: " + vow);
		System.out.println("Number of consonant in a string is: " + con);
	}
}