package jdbc_task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



public class CopyHtmlDataToSheet{
	public static void main(String[] args) throws Exception {
		
	
		Document document=Jsoup.parse(new File("user.html"),"UTF-8");
		System.out.println(document);
		
		Elements rows=document.getElementsByTag("tr");
		
		System.out.println("Number of elements are :- " + rows.size());
		
		
	XSSFWorkbook workbook = new XSSFWorkbook();

	XSSFSheet sheet = workbook.createSheet();
	
	XSSFRow xclrow;
	
	for(int i=0;i<rows.size();i++)
	{
		xclrow=sheet.createRow(i);
		
		Element row=rows.get(i);
		
		Elements cols=row.select("td");
		
		int cellid=0;
		
		for(Element columnElement : cols)
		{
			Cell cell=xclrow.createCell(cellid++);
			cell.setCellValue(columnElement.html());
		}
		
		System.out.println("Record added ");
		
	}
	
	workbook.write(new FileOutputStream("users.xlsx"));
	
	System.out.println("Excel is created");
	
	
	

	
}}
