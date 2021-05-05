import java.util.*;
public class TempleDonation
{
	public static void main(String args[])
	{
		float temp_amt=2,final_amt=0;
		System.out.println("Enter no. of temples: ");
		Scanner s=new Scanner(System.in);
		int tmp=s.nextInt();
		System.out.println("Enter donation amount for each temple: ");
		int donate_amt=s.nextInt();
		for(int i=1;i<=tmp;i++)
		{
			final_amt=final_amt*2+donate_amt;
			temp_amt*=2;
		}
		float initial_amt=final_amt/(temp_amt/2);
		System.out.println(initial_amt);
	}
}		