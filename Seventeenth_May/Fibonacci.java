import java.util.Scanner;   
public class Fibonacci extends Thread 
{   
 	public void run() 
 	{ 
 		int a=0,b=1,c=0; 
 		Scanner s = new Scanner(System.in); 
 		System.out.print("Please Enter Number of Terms: "); 
 		int n = s.nextInt();  
 		System.out.print("Finbonacci Series: "); 
 		while (n>0) 
		{ 
              		System.out.print(c+" "); 
			a=b; 
              		b=c; 
              		c=a+b; 
              		n=n-1; 
		} 
 		System.out.println(); 
	} 
} 
