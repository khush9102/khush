import java.io.*;
public class FileDelete
{
	public static void main(String args[])
	{
		try
		{
			File f=new File("E:\\documents\\mytest.txt");
			if(f.delete())
				System.out.println("Delete operation successful");
			else
				System.out.println("File does not exist");
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}