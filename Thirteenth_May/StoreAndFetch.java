public class StoreAndFetch<T> 
{  	 
	T obj; 
 	StoreAndFetch(T obj) 
 	{ 
 		this.obj=obj; 
 	} 
 	public T getObj() 
 	{ 
 		return this.obj; 
 	} 
  
 	public static void main(String[] args) { 
 		StoreAndFetch <String> obj1 = new storeAndFetch <String> ("Hello"); 
 		StoreAndFetch <String> obj2 = new storeAndFetch <String> ("My Name is Jay And"); 
 		StoreAndFetch <String> obj3 = new storeAndFetch <String> ("My Age is"); 
 		StoreAndFetch <Integer> obj4 = new storeAndFetch <Integer> (22); 
 		System.out.print(obj1.getObj()+" "+obj2.getObj()+" "+obj3.getObj()+" "+obj4.getObj()); 
 	} 
  
 } 
