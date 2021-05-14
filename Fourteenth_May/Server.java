import java.io.*;
import java.net.*;

public class Server
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket ss= new ServerSocket();
		Socket s=ss.accept();
		System.out.println("connection established");
		
		PrintStream ps= new PrintStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedReader kbdata = new BufferedReader(new InputStreamReader(System.in));

		String clientstr,kbstr;
		while(!((clientstr=br.readLine()).equals("exit")))
		{
			System.out.println("message from client : "+clientstr);
			kbstr=kbdata.readLine();
			ps.println(kbstr);
		}
		ss.close();
	}
}