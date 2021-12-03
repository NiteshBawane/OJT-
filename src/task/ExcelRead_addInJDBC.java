package task;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mysql.jdbc.Driver;

public class ExcelRead_addInJDBC {
	public static void main(String args[]) throws Exception {

		DriverManager.registerDriver(new Driver());

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqldemo", "root", "1234");
		System.out.println("Connection establised");

		PreparedStatement ps1 = con.prepareStatement("insert into faculty values(?,?,?)");
		PreparedStatement ps2 = con.prepareStatement("insert into admin values(?,?,?)");
		PreparedStatement ps3 = con.prepareStatement("insert into student values(?,?,?)");

		// obtaining input bytes from a file

		FileInputStream fis = new FileInputStream(new File("DataJDBC.xlsx"));
		try {

			// creating Workbook instance that refers to .xlsx file
			XSSFWorkbook wb = new XSSFWorkbook(fis);// workbook object contains
													// the data from excel file
			XSSFSheet sheet = wb.getSheetAt(0); // creating a Sheet object to
												// retrieve object
			Iterator<Row> itr = sheet.iterator(); // iterating over excel file
			while (itr.hasNext()) {

				Row row = itr.next();
				int count = 0;
				int[] numbers = new int[2];
				String[] strings = new String[4];
				int numIndex = 0;
				int stringIndex = 0;//

				Iterator<Cell> cellIterator = row.cellIterator(); // iterating
																	// over each
																	// cell
				while (cellIterator.hasNext()) {
					count = count + 1;
					Cell cell = cellIterator.next();
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_STRING: // field that represents string
												// cell type
						strings[stringIndex] = cell.getStringCellValue();
						System.out.print(cell.getStringCellValue() + "\t\t\t");
						stringIndex++;

						/*
						 * if(count==4) { String role =
						 * cell.getStringCellValue();
						 * System.out.print("Role is : "+role); }
						 */

						break;
					case Cell.CELL_TYPE_NUMERIC: // field that represents number
													// cell type
						System.out.print(cell.getNumericCellValue() + "\t\t\t");
						numbers[numIndex] = (int) cell.getNumericCellValue();
						numIndex++;

						break;
					default:
					}
				} // row ends

				// Reading the values from array and setting it a query.

				if (strings[1].equals("Faculty")) {
					ps1.setInt(1, numbers[0]);
					ps1.setInt(2, numbers[1]);
					ps1.setString(3, strings[0]);

					ps1.executeUpdate();
				} // Faculty ends

				if (strings[1].equals("Admin")) {
					ps2.setInt(1, numbers[0]);
					ps2.setInt(2, numbers[1]);
					ps2.setString(3, strings[0]);
					ps2.executeUpdate();
				} // Admin ends

				if (strings[1].equals("student")) {
					ps3.setInt(1, numbers[0]);
					ps3.setInt(2, numbers[1]);
					ps3.setString(3, strings[0]);
					ps3.executeUpdate();
				} // student ends

				System.out.println("");
			} // while ends

			System.out.println("Data Successfully Inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
