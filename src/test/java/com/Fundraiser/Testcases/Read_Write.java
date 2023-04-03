package com.Fundraiser.Testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Write {

	public static void main(String[] args) throws IOException {
		

		FileInputStream a = new FileInputStream("C:\\Kiran\\Excel Files\\ExcelRead.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(a);
		XSSFSheet ws =wb.getSheet("Employee_Data");
		Row r=null; 
		Cell c=null;
		java.util.Iterator<Row>row =ws.iterator();
		while(row.hasNext())
		{
			r=row.next();
		java.util.Iterator<Cell>cell=r.iterator();
		while(cell.hasNext())
		{
			c=cell.next();
			if(c.getCellType().equals(c.getNumericCellValue()))
			{
				System.out.println(c.getNumericCellValue());
			}
			else if(c.getCellType().equals(c.getCellType()))
			{
				System.out.println(c.getStringCellValue());

			}
				
			}


				}

	}

}
