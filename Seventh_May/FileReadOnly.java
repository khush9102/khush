import java.io.*;
public class FileReadOnly
{
	public static void main(String args[])
	{
		try
		{
			File f=new File("E:\\documents\\test.txt");
			boolean b=f.setReadOnly();
			if(b)
				System.out.println("File converted to read only mode");
			else
				System.out.println("Read only operation failed");			
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}