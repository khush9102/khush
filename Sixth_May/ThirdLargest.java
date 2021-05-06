import java.util.*;
public class ThirdLargest
{
	public static void main(String args[])
	{
		int temp;
		System.out.println("Enter size of an array: ");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("Enter elements of an array: ");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;					
				}
			}
		}
		System.out.println("Third largest element of an array is: " + a[size-3]);
	}
}