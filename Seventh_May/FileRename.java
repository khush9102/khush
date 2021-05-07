import java.io.*;
public class FileRename
{
	public static void main(String args[])
	{
		try
		{
			File f1=new File("E:\\documents\\test.txt");
			File f2=new File("E:\\documents\\mytest.txt");
			if(f1.renameTo(f2))
				System.out.println("Rename operation successful");
			else
				System.out.println("Rename operation failed");
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}