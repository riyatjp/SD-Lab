import java.io.*;
import java.net.*;
public class TCPServer
{
	String str;
	public TCPServer()
	{
		try
		{
			ServerSocket ss=new ServerSocket(5555);
			Socket s=ss.accept();
			BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			System.out.println("connected");
			do
			{
				str=br.readLine();
				System.out.println(str);
			}while(!str.equals("exit"));
			ss.close();
		}
		catch(Exception ex)
		{
			
		}
	}
	public static void main(String args[])
	{
		TCPServer s=new TCPServer();
	}
}
