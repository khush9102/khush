import java.util.*;
public class SmallLargeWord
{
	public static void main(String args[])
	{
		String word="",small="",large="";
		int length=0;
		System.out.println("Enter the string: ");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String[] words=new String[str.length()];
		str=str+" ";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
				word=word+str.charAt(i);
			else
			{
				words[length]=word;
				length++;
				word="";
			}
		}
		small=large=words[0];
		for(int i=0;i<length;i++)
		{
			if(small.length()>words[i].length())
				small=words[i];
			if(large.length()<words[i].length())
				large=words[i];
		}
		System.out.println("Smallest word of the string: " + small);
		System.out.println("Largest word of the string: " + large);
	}
}