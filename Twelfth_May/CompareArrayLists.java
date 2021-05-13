import java.util.*; 
public class CompareArrayLists 
{  
	public static void main(String[] args) 
	{ 
 		Scanner s = new Scanner(System.in); 
 		ArrayList <Integer> a1 = new ArrayList <Integer> (); 
 		ArrayList <Integer> a2 = new ArrayList <Integer> (); 
 		System.out.print("Enter The Size of first Array: "); 
 		int n1 = s.nextInt(); 
 		System.out.print("Enter The Elements of first Array: "); 
 		for(int i=0;i<n1;i++) 
 		{ 
 			a1.add(s.nextInt()); 
 		} 
 		System.out.print("Enter The Size of second Array: "); 
 		int n2 = sc.nextInt(); 
 		System.out.print("Enter The Elements of second Array: "); 
 		for(int i=0;i<n2;i++) 
 		{ 
 			a2.add(s.nextInt()); 
 		} 
 		if(a1.equals(a2)) 
 		{ 
 			System.out.print("Both Are Equal with the Size: "+a1.size()); 
 		} 
 		else { 
 			System.out.print("Both Are Not Equal and the Size of first Array is: "+a1.size()+" And" 
 					+ "Size of second Array is: "+a2.size()); 
 		} 
 	}  
 } 
