import java.io.*;
import java.util.*;
public class WriteBufferedWriter
{
	public static void main(String args[])
	{
		System.out.println("Enter text to write into file: ");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		try
		{
			FileWriter f=new FileWriter("E:\\documents\\test.txt");
			BufferedWriter b=new BufferedWriter(f);
			f.write(str);
			b.close();
			f.close();
			System.out.println("Write operation successful");
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}