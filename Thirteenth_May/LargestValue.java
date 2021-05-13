public class LargestValue<T> 
{  	 	 
 	public <T extends Comparable<T>> T findLargest(T x, T y, T z) 
 	{ 
 		if((x.compareTo(y)>0) && (x.compareTo(z)>0)) 
 		{ 
 			return x; 
 		} 
 		else if((y.compareTo(z)>0) && (y.compareTo(x)>0)) 
 		{ 
 			return y; 
 		} 
 		else 
 		{ 
 			return z; 
 		} 
 	} 
 	 
 	public static void main(String[] args) 
	{ 
 		LargestValue <Integer> obj = new LargestValue <Integer>(); 
 		System.out.print("Largest Among Three is: "+obj.findLargest(2, 5, 3)); 
 	} 
} 