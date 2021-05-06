import java.util.*;
public class ArrayCopy
{
	public static void main(String args[])
	{
		System.out.println("Enter size of an array: ");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] a=new int[size];
		int[] b=new int[size];
		System.out.println("Enter elements of an array: ");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			b[i]=a[i];
		}
		System.out.println("Elements of another array: ");
		for(int i=0;i<size;i++)
		{
			System.out.println(b[i]);
		}
	}
}
