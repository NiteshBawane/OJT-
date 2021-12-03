package jdbc_task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SendEmployeeData {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "1234");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "1234");
		
		System.out.println("Connected");
		
		PreparedStatement ps = con.prepareStatement("SELECT * FROM employee");

		PreparedStatement ps1 = con1.prepareStatement("insert into Analytics_Sec values(?,?,?)");
		PreparedStatement ps2 = con1.prepareStatement("insert into Admin_Sec values(?,?,?)");
		PreparedStatement ps3 = con1.prepareStatement("insert into HR_Sec values(?,?,?)");


		ResultSet rs = ps.executeQuery();

		System.out.println("eid\tename\tephone\tedepartment");
		while (rs.next()) {
		System.out.println(rs.getInt("eid")+"\t"+rs.getString("ename")+"\t"+rs.getInt("ephone")+"\t"+rs.getString("edepartment"));
		
			 if (rs.getString("edepartment").equalsIgnoreCase("Analytics_Sec")) {
				ps1.setInt(1, rs.getInt("eid"));
				ps1.setInt(3, rs.getInt("ephone"));
				ps1.setString(2, rs.getString("ename"));
                ps1.executeUpdate();
			 }
			if (rs.getString("edepartment").equalsIgnoreCase("Admin_Sec")) {
				ps2.setInt(1, rs.getInt("eid"));
				ps2.setInt(3, rs.getInt("ephone"));
				ps2.setString(2, rs.getString("ename"));
                ps2.executeUpdate();
			}
			if (rs.getString("edepartment").equalsIgnoreCase("HR_Sec")) {
				ps3.setInt(1, rs.getInt("eid"));
				ps3.setInt(3, rs.getInt("ephone"));
				ps3.setString(2, rs.getString("ename"));
                ps3.executeUpdate();
			} 
		} 
		System.out.println("Data Successfully Inserted....");

	}
	}


