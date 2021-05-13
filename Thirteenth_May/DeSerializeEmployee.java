import java.io.*; 
public class DeSerializeEmployee 
{  
 	public static void main(String[] args) 
	{ 
 		try 
 		{    
 		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("E:\\documents\\employee.txt"));   
 		  employee e=(employee)in.readObject();   
 		  System.out.println(e.eid+" "+e.Name+" "+e.salary);     
 		  in.close();   
 		  }
		catch(Exception e)
		{ 
 			  System.out.println(e); 
 		}   
 	} 
 } 
