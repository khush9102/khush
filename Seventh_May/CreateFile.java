import java.io.*;
public class CreateFile
{
	public static void main(String args[])
	{
		try
		{
			File f=new File("E://documents//test.txt");
			if(f.createNewFile())
				System.out.println("File created");
			else
				System.out.println("File already exists");
		}
		catch(IOException ioe)
		{
			ioe.getMessage();
		}
	}
}