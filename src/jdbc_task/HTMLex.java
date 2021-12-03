package jdbc_task;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.mysql.jdbc.PreparedStatement;

public class HTMLex {
	public static void main(String[] args) throws Exception {
		
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Connected");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "1234");

PreparedStatement ps = (PreparedStatement) con.prepareStatement("insert into users(id,name,phone,role) values(?,?,?,?)");// ps


		Document document=Jsoup.parse(new File("user.html"),"UTF-8");
		System.out.println(document);
		
		Elements rows=document.getElementsByTag("tr");
		
		System.out.println("Number of elements are :- " + rows.size());
		
		
		for(int i=1;i<rows.size();i++)
		{
			Element row=rows.get(i);
			
			Elements cols=row.select("td");
			
			
			ps.setInt(1,Integer.parseInt(cols.get(0).html()));
			ps.setString(2,cols.get(1).html());
			ps.setString(3,cols.get(2).html());
			ps.setString(4,cols.get(3).html());
			
		//	ps.execute();
			System.out.println(cols);

			System.out.println("Record added ");
			
		}
		
	}


}
