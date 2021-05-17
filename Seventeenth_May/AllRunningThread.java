public class AllRunningThread extends Thread 
{  
	public static void main(String[] args) 
	{ 
		AllRunningThread t1 = new AllRunningThread(); 
 	      	t1.setName("thread1"); 
		AllRunningThread t2 = new AllRunningThread(); 
 	      	t2.setName("thread2"); 
		AllRunningThread t3 = new AllRunningThread(); 
 	      	t3.setName("thread3"); 
 	      	t1.start();
 	      	t2.start();
 	      	t3.start(); 
 	      	ThreadGroup currentGroup = Thread.currentThread().getThreadGroup(); 
 	      	int noThreads = currentGroup.activeCount(); 
 	      	Thread[] lstThreads = new Thread[noThreads]; 
 	      	currentGroup.enumerate(lstThreads); 
 	      	for (int i = 1; i < noThreads; i++) 
 	      	{ 
 	    	  	System.out.println("Thread No:" + i + " & The Name of Thread is: " + lstThreads[i].getName()); 
 	      	}  
	} 
} 
