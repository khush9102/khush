import java.util.*;
public class RotateArray
{
	public static void main(String args[])
	{
		System.out.println("Enter size of an array: ");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("Enter elements of an array: ");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Elements of original array: ");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		int b=a[size-1];
		for(int i=size-1;i>0;i--)
			a[i]=a[i-1];
		a[0]=b;
		System.out.println("Elements an array after rotation: ");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}
}