import java.io.*;
import java.util.*;
public class WriteFileOutputStream
{
	public static void main(String args[])
	{
		System.out.println("Enter text to write into file: ");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		try
		{
			FileOutputStream f=new FileOutputStream("E:\\documents\\test.txt");
			f.write(str.getBytes());
			f.close();
			System.out.println("Write operation successful");
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}