import java.io.*;
public class ReadFileBufferedReader
{
	public static void main(String args[])
	{
		try
		{
			FileReader f=new FileReader("E:\\documents\\test.txt");
			BufferedReader b=new BufferedReader(f);
			String str;;
			while((str=b.readLine())!=null)
				System.out.print(str);
			b.close();
			f.close();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}