import java.util.*;
public class Frequency
{
	public static void main(String args[])
	{
		System.out.println("Enter size of an array: ");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] a=new int[size];
		int[] fr=new int[size];
		System.out.println("Enter elements of an array: ");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
			fr[i]=-1;
		}
		for(int i=0;i<size;i++)
		{
			int count=1;
			for(int j=i+1;j<size;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					fr[j]=0;
				}
			}
			if(fr[i]!=0)
				fr[i]=count;
		}
		for(int i=0;i<size;i++)
		{
			if(fr[i]!=0)
				System.out.println("Frequency of " + a[i] + " is " + fr[i]);
		}
				
	}
}