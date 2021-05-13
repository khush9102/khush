public class Employee implements Comparable<Employee> 
{ 
	String name; 
     	int eid;    
     	int age;   
 	Student(String name, int eid,int age)
	{ 
     		this.name = name; 
     		this.eid = eid;   
     		this.age = age;   
   	} 
	   
 	public int compareTo(Employee e) 
 	{    
  		if(eid == e.eid)   
   			return 0;   
 		else if(eid > e.eid)   
 			return 1;   
 		else   
 			return -1;   
    	}   
} 
