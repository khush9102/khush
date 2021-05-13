import java.util.*; 
public class MaxElement 
{   
 	public static <T extends Comparable<T>> T maxelement (List<T> list, int from, int to) { 
         T max = list.get(from); 
         for (int i = from + 1; i < to; i++) { 
             T elem1 = list.get(i); 
             if (elem1.compareTo(max) > 0) { 
                 max = elem1; 
             } 
         } 
         return max; 
     } 
 	 
 	public static void main(String[] args) { 
 		ArrayList <Integer> al = new ArrayList <Integer> (); 
 		al.add(10); 
 		al.add(20); 
 		al.add(35); 
 		al.add(40); 
 		al.add(25); 
 		System.out.print("Maximal Element :"+maxelement(al,0,3)); 
 	} 
  
 } 
