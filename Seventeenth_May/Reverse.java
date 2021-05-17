public class Reverse extends Thread 
{   
 	public void run() 
 	{ 
 		System.out.print("Reverse Series: "); 
 		for(int i=10;i>=0;i--) 
 		{ 
 			System.out.print(i+ " "); 
 		} 
 	}  
} 
