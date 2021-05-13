import java.util.Vector;
import java.util.Collections;
public class SwapVectorElements 
{
   	public static void main(String[] args) 
	{
      		Vector v = new Vector();
      		v.add("1");
      		v.add("2");
      		v.add("3");
      		v.add("4");
      		v.add("5");
		System.out.println("Vector elements before swapping : " + v);
      		Collections.swap(v,0,4);
      		System.out.println("Vector elements after swapping : " + v);
   }
}