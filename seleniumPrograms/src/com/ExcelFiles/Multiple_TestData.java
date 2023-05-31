package com.ExcelFiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Multiple_TestData {
	
public static void main(String[] args) throws IOException {
		
		FileInputStream excelTestDataFile =new FileInputStream("./src/com/ExcelFiles/SingleTestData.xlsx");
		
		XSSFWorkbook workBook=new XSSFWorkbook(excelTestDataFile);
		
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		int  rowCount=sheet.getLastRowNum();
		for (int rowindex=0;rowindex<=rowCount;rowindex++)
		{
			Row row=sheet.getRow(rowindex);
			int cellCount=row.getLastCellNum();
			
			for(int rowofcellindex=0;rowofcellindex<=cellCount;rowofcellindex++)
			{
				Row activerow=sheet.getRow(rowindex);
				Cell activerowofactivecell=row.getCell(rowofcellindex);
				String testData=activerowofactivecell.getStringCellValue();
				System.out.print( testData);
			}
			System.out.println();
		
	}

}


}
