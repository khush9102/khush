import java.util.*;
public class Car
{
	public static void main(String[] args)
	{
		int resale=0;
		System.out.println("Enter details of the car: ");
		Scanner s=new Scanner(System.in);
		String name=s.nextLine();
		String model=s.nextLine();
		int year=s.nextInt();
		int price=s.nextInt();
		System.out.println("How old your car is: ");
		int old=s.nextInt();
		for (int i=0;i<old;i++)
		{
			price=price-(price/10);
			resale=price;
		}
		System.out.println("Details of the car: ");
		System.out.println("Car name: " + name);
		System.out.println("Model name: " + model);
		System.out.println("Year of purchase: " + year);
		System.out.println("Price: " + price); 
	}
	
}		