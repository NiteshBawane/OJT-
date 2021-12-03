package jdbc_task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SendSpecialCharactor_toDB {
	public static void main(String[] args) throws Exception {
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "1234");
	Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/xyz", "root", "1234");
	
	System.out.println("Connected");
	
	PreparedStatement ps = con.prepareStatement("SELECT * FROM student where sname like '%@' or sname like '%$'");

	PreparedStatement ps1 = con1.prepareStatement("insert into student_clone values(?,?,?)");

	ResultSet rs = ps.executeQuery();

	System.out.println("sid\tsname\tsphone");
	while (rs.next()) {
	System.out.println(rs.getInt("sid")+"\t"+rs.getString("sname")+"\t"+rs.getInt("sphone"));
	
			ps1.setInt(1, rs.getInt("sid"));
			ps1.setInt(3, rs.getInt("sphone"));
			ps1.setString(2, rs.getString("sname"));
            ps1.executeUpdate();
		
	} 
	System.out.println("Data Successfully Inserted....");

}
}


