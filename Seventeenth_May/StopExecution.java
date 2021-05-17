import java.io.IOException;   
public class StopExecution implements Runnable
{ 
 	boolean continueThread=true; 
 	public void run() 
     	{ 
          	try 
          	{ 
         	 	while(continueThread) 
         	 	{ 
                		System.out.println(Thread.currentThread().getName()+" is Running"); 
                		Thread.sleep(300); 
         	 	} 
          	} 
          	catch (Exception e) 
          	{ 
               		e.printStackTrace(); 
          	} 
     	} 
 	public static void main(String[] args) 
	{ 
 		StopExecution se = new StopExecution(); 
         	Thread t = new Thread(se); 
         	t.start();  
         	System.out.println(Thread.currentThread().getName() + " thread waiting for user to press ctrl+c"); 
         	try 
		{ 
 			System.in.read(); 
 		} 
		catch (IOException e) 
		{ 
 			e.printStackTrace(); 
 		} 
         	se.continueThread = false;           
 	} 
} 
