package task;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

public class ReadJSON {
    //                 System.in
	// Java program    =======      Keyboard
	//                InputStream
	
	//  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//  Scanner  scanner = new Scanner(System.in)
	
	//                 InputStream
	// Java program   ===========     Webservice ("http://localhost:8085/students/1")
	public static void main(String[] args) {
	

		String restURL=	"http://localhost:8086//student//1";
		
		try
		{
			
			URL url=new URL(restURL);
			
			HttpURLConnection connection=(HttpURLConnection)url.openConnection();
					
			InputStream inputStream=connection.getInputStream();
						
			Scanner scanner = new Scanner(inputStream);
			
			String s=scanner.nextLine();
			
			System.out.println(s);
			
			String[] strings=s.split(","); // strings [{"rno":1]   ["marks":80}]
			
			String[] values=new String[2];
			
			int index=0;
			
			for(String string:strings)
			{
				String r=string.substring(string.indexOf(':')+1).replace('}',' ').trim();
				values[index]=r;
				index++;
			}
			
			for(String value:values)
			{
				System.out.println(value);
			}
			
			System.out.println(Arrays.toString(values));
			
			DriverManager.registerDriver(new Driver());
			
			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1234");
				
			Statement st1 = con1.createStatement();
			
			int rno=Integer.parseInt(values[0]);
			int marks=Integer.parseInt(values[1]);
			
			//insert into student values(1,80)
			
			st1.executeUpdate("insert into student values("+rno+","+marks+")");
			
			System.out.println("Record added");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
