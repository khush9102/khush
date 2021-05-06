import java.util.*;
public class Calculator
{
	public static void main(String args[])
	{ 	
		System.out.println("Enter two number : ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Enter your choice : ");
		int ch=s.nextInt();
		switch(ch)
		{
			case 1: System.out.println("Addition : ");
				System.out.println(a+b);
				break;
			case 2: System.out.println("Subtraction : ");
				System.out.println(a-b);
				break;
			case 3: System.out.println("Multiplication : ");
				System.out.println(a*b);
				break;
			case 4: System.out.println("Division : ");
				System.out.println(a/b);
				break;
			default: System.out.println("Invalid choice");
		}
	}
}