import java.util.*;
public class MinMax
{
	public static void main(String args[])
	{
		int min,max;
		System.out.println("Enter the string: ");
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		int[] fr=new int[str1.length()];
		char minchar=str1.charAt(0),maxchar=str1.charAt(0);
		char str2[]=str1.toCharArray();
		for(int i=0;i<str2.length;i++)
		{
			fr[i]=1;
			for(int j=i+1;j<str2.length;j++)
			{
				if(str2[i]==str2[j] && str2[i]!=' ' &&str2[i]!='0')
				{
					fr[i]++;
					str2[j]='0';
				}
			}
		}
		min=max=fr[0];
		for(int i=0;i<fr.length;i++)
		{
			if(min>fr[i] && fr[i]!='0')
			{
				min=fr[i];
				minchar=str2[i];
			}
			if(max<fr[i])
			{
				max=fr[i];
				maxchar=str2[i];
			}
		}
		System.out.println("Minimum occuring character is: " + minchar);
		System.out.println("Maximum occuring character is: " + maxchar);
	}
}