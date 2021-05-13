import java.util.Collections;
import java.util.Vector;
public class BinarySearchVector
{
   	public static void main(String[] args) {
      	Vector<String> v = new Vector<String>();
      	v.add("K");
      	v.add("H");
      	v.add("U");
      	v.add("S");
      	v.add("H");
      	Collections.sort(v);
      	System.out.println("Vector elements: " + v);
      	int i=Collections.binarySearch(v, "U");
      	System.out.println("Element is found at index: " + i);
   }
}