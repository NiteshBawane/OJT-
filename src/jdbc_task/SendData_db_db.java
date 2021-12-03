package jdbc_task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SendData_db_db {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "1234");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/xyz", "root", "1234");
		
		System.out.println("Connected");
		
		PreparedStatement ps = con.prepareStatement("SELECT * FROM User");

		PreparedStatement ps1 = con1.prepareStatement("insert into faculty values(?,?,?)");
		PreparedStatement ps2 = con1.prepareStatement("insert into admin values(?,?,?)");
		PreparedStatement ps3 = con1.prepareStatement("insert into student values(?,?,?)");


		ResultSet rs = ps.executeQuery();

		System.out.println("id\tname\tphone\trole");
		while (rs.next()) {
		System.out.println(rs.getInt("id")+"\t"+rs.getString("name")+"\t"+rs.getInt("phone")+"\t"+rs.getString("role"));
		
			 if (rs.getString("role").equalsIgnoreCase("faculty")) {
				ps1.setInt(1, rs.getInt("id"));
				ps1.setInt(2, rs.getInt("phone"));
				ps1.setString(3, rs.getString("name"));
                ps1.executeUpdate();
			 }
			if (rs.getString("role").equalsIgnoreCase("admin")) {
				ps2.setInt(1, rs.getInt("id"));
				ps2.setInt(2, rs.getInt("phone"));
				ps2.setString(3, rs.getString("name"));
                ps2.executeUpdate();
			}
			if (rs.getString("role").equalsIgnoreCase("student")) {
				ps3.setInt(1, rs.getInt("id"));
				ps3.setInt(2, rs.getInt("phone"));
				ps3.setString(3, rs.getString("name"));
                ps3.executeUpdate();
			} 
		} 
		System.out.println("Data Successfully Inserted....");

	}
	}
