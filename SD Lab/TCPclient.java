import java.io.*;
import java.net.*;
public class TCPClient
{
	public static void main(String args[]) throws IOException
	{
		try
		{
			Socket sk=new Socket("Localhost",5555);
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String line;
			do
			{
				line=br.readLine();
				PrintWriter pw=new PrintWriter(sk.getOutputStream(),true);
				pw.println(line);
			}while(!line.equals("exit"));
			sk.close();
		}
		catch(Exception ex)
		{
			System.out.println("Cannot connect to the server");
		}
	}
}
