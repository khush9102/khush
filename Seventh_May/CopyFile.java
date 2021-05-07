import java.io.*;
public class CopyFile
{
	public static void main(String args[])
	{
		try
		{
			FileReader fr=new FileReader("E:\\documents\\test.txt");
			FileWriter fw=new FileWriter("E:\\documents\\mytest.txt");
			int i;
			while((i=fr.read())!=-1)
				fw.write((char)i);
			System.out.println("Copy operation successful");
			fr.close();
			fw.close();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}
