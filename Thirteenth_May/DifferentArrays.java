import java.util.*; 
public class DifferentArrays<T> 
{  	 
 	T obj; 
 	DifferentArrays(T obj) 
 	{ 
 		System.out.println(obj); 
 	} 
  
 	public static void main(String[] args) 
	{ 
 		DifferentArrays <String> obj = new DifferentArrays <String> ("Hello"); 
 		DifferentArrays <Integer> obj1 = new DifferentArrays <Integer> (10); 
 		DifferentArrays <Double> obj2 = new DifferentArrays <Double> (5.0); 
 		DifferentArrays <Boolean> obj3 = new DifferentArrays <Boolean> (false); 
 	} 
  
 } 
