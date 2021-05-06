import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class FirstLetter
{
	public static void main(String args[])
	{
		System.out.println("Enter a string");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String regex="\\b[a-zA-Z]";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(str);
		System.out.println("First letter of each word from the string: ");
		while(m.find())
			System.out.println(m.group()+" ");
	}
}