public class MyThread implements Runnable 
{   
	public static void main(String[] args) 
	{ 
		MyThread obj = new MyThread(); 
 		Thread t = new Thread(obj); 
 		t.start(); 
 	} 

 	public void run() 
	{ 
 		System.out.println("Thread is created");   		 
 	}   
} 
