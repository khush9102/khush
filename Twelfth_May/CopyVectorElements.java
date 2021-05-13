import java.util.Collections;
import java.util.Vector; 
public class CopyVectorElements
{   
	public static void main(String[] args) 
	{          
		Vector v1 = new Vector();     
		v1.add("1");
		v1.add("2");    
		v1.add("3");  
		Vector v2 = new Vector();        
		v2.add("4");    
		v2.add("5");    
		v2.add("6");    
		v2.add("7");    
		v2.add("8");      
		System.out.println("Before copy, Second Vector Contains : " + v2);        
		System.out.println("After copy, Second Vector Contains : " + v2);     
	}
}