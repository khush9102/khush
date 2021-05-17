public class FiboAndRev
{  
 	public static void main(String[] args)
	{ 
 		try 
		{ 
 			Fibonacci f = new Fibonacci(); 
 			f.start(); 
 			Thread.sleep(5000);
 			Reverse r = new Reverse(); 
 			r.start(); 
 		}
		catch(Exception e) 
 		{ 
 			e.printStackTrace(); 
 		} 
 	} 
} 
