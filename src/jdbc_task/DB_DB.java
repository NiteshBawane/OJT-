package jdbc_task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB_DB {
public static void main(String[] args) throws  Exception {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/xyz","root","1234");
		System.out.println("Connected");
		
		PreparedStatement ps1=con1.prepareStatement("insert into faculty values(?,?,?)");
		PreparedStatement ps2=con1.prepareStatement("insert into admin values(?,?,?)");
		PreparedStatement ps3=con1.prepareStatement("insert into student values(?,?,?)");
		
		String query = "create table xyz.user1 as select* from abc.User";

		Statement st = con1.createStatement();

		ResultSet rs = st.executeQuery(query);

//		System.out.println("id\t\tname\t\tphone\t\trole");
//		while (rs.next()) {
//			int id = rs.getInt("id");
//			String name = rs.getString("name");
//			int phone = rs.getInt("phone");
//			String role = rs.getString("role");
//
//			System.out.println(+id+"\t\t" + name+"\t\t" + phone+"\t\t" + role);
	System.out.println("table created");
	
	
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}

}
}
