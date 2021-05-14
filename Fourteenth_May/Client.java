import java.io.*;
import java.net.*;
public class Client
{
	public static void main(String[] args) throws Exception
	{
		Socket s = new Socket ("127.0.0.1",7771);
		PrintStream ps = new PrintStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedReader kbdata = new BufferedReader(new InputStreamReader(System.in));
		
		String serverStr,kbstr;
		while(true)
		{
			kbstr = kbdata.readLine();
			ps.println(kbstr);
			if(kbstr.equals("exit"))
				break;
			serverStr = br.readLine();
			System.out.println("Message from server --" +serverStr);
			
		}
		br.close();
		kbdata.close();
		s.close();
	} 
}
