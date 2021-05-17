public class Synchronization extends Thread
{  	 
	public void print(int n) 
 	{ 
 		synchronized(this) 
 		{ 
 			for(int i=1; i<=n; i++) 
 			{ 
 				System.out.println("Thread: " + i); 
 				try 
 				{ 
 					Thread.sleep(500); 
 				} 
 				catch(Exception e) 
 				{ 
 					System.out.println(e); 
 				} 
 			} 
 		} 
 	} 
  
 	public static void main(String [] args) 
 	{ 
 		Synchronization s = new Synchronization(); 
 		Thread t1 = new Thread() 
		{ 
 			public void run() 
 			{ 
 				s.print(3); 
 			} 
 		}; 
 		Thread t2 = new Thread() 
		{ 
 			public void run() 
 			{ 
 				s.print(5); 
 			} 
 		}; 
 		t1.start(); 
 		t2.start(); 
 	} 
} 
