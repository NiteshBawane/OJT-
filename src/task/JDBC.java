package task;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class JDBC {
	public static void main(String[] args) throws IOException, Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pqr","root","1234");
		System.out.println("Connected");
		
		PreparedStatement ps1=con.prepareStatement("insert into faculty values(?,?,?)");
		PreparedStatement ps2=con.prepareStatement("insert into admin values(?,?,?)");
		PreparedStatement ps3=con.prepareStatement("insert into student values(?,?,?)");

	FileInputStream file = new FileInputStream(new File("Book1.xls"));
	try
	{
	HSSFWorkbook wb=new HSSFWorkbook(file);
	HSSFSheet sheet= wb.getSheetAt(0);
	Iterator<Row> itr=sheet.iterator();
	while (itr.hasNext()) {
		 Row row=itr.next();
		 int count =0; 
			int[] numbers = new int[2];
			String[] strings = new String[4]; 
			int numIndex =0;
			int stringIndex=0;
	 Iterator<Cell> celliterator=row.cellIterator();
		 while (celliterator.hasNext()) {
			 count = count+1;
		 Cell cell=celliterator.next();
		 switch (cell.getCellType()) {
		 case Cell.CELL_TYPE_STRING:
				strings[stringIndex] = cell.getStringCellValue();
				System.out.print(cell.getStringCellValue()+"\t\t");
				stringIndex++;
				break;
		 
			case Cell.CELL_TYPE_NUMERIC:
			System.out.print(cell.getNumericCellValue()+"\t\t");
			numbers[numIndex] = (int) cell.getNumericCellValue();
			numIndex++;
				break;
			
			}
		}
		 if(strings[1].equals("faculty"))
			{
				ps1.setInt(1, numbers[0]);
				ps1.setInt(2, numbers[1]);
				ps1.setString(3, strings[0]);
				
				ps1.executeUpdate();
			}//Faculty ends
			
			if(strings[1].equals("admin"))
			{
				ps2.setInt(1, numbers[0]);
				ps2.setInt(2, numbers[1]);
				ps2.setString(3, strings[0]);
				ps2.executeUpdate();
			}//Admin ends
			
			if(strings[1].equals("student"))
			{
				ps3.setInt(1, numbers[0]);
				ps3.setInt(2, numbers[1]);
				ps3.setString(3, strings[0]);
				ps3.executeUpdate();
			}//student ends
	
			System.out.println("");
		} // while ends 
	System.out.println("Successfully Inserted");

	} catch (Exception e) {
		e.printStackTrace();

	}
		 
		 
	}

}

	

