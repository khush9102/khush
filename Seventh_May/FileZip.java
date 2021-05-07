import java.io.*;
import java.util.zip.*;
public class FileZip
{
	public static void main(String args[])
	{
		try
		{
			File f=new File("E:\\documents\\test.txt");
			FileOutputStream fos=new FileOutputStream("E:\\documents\\mytest.zip");
			ZipOutputStream zos=new ZipOutputStream(fos);
			FileInputStream fis=new FileInputStream(f);
			ZipEntry ze=new ZipEntry(f.getName());
			zos.putNextEntry(ze);
			byte[] b=new byte[1024];
			int length;
			while((length=fis.read(b))>=0)
				zos.write(b,0,length);
			zos.close();
			fis.close();
			fos.close();
			System.out.println("Zip operation successful");
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}