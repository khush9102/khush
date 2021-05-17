public class MultipleThread 
{
	private static class Parallel implements Runnable 
	{
        	public void run() 
		{
            		System.out.println(Thread.currentThread().getName() + " is executing");
        	}
   	}

    	public static void main(String[] args) 
	{
        	Thread t1 = new Thread(new Parallel(), "Thread - T1");
        	Thread t2 = new Thread(new Parallel(), "Thread - T2");
        	Thread t3 = new Thread(new Parallel(), "Thread - T3");

	        t1.start();
        	t2.start();
	        t3.start();
    	}
}

