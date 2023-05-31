package com.ExcelFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceloperations {
	private static Cell rowOfCell;

	public static void main(String[] args) throws IOException {
		
		FileInputStream excelTestDataFile =new FileInputStream("./src/com/ExcelFiles/SingleTestData.xlsx");
		
		XSSFWorkbook workBook=new XSSFWorkbook(excelTestDataFile);
		
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		 Row sheetOfRow=sheet.getRow(0);
		//Cell rowOfCell = null;
		Cell rowOfCell=sheetOfRow.getCell(0);
		
		String testData=rowOfCell.getStringCellValue();
		System.out.println("the data in the row of cell is:- ("+testData+")");
		
		//C:\Users\shiva nnarayana\eclipse-workspace\seleniumPrograms\src\com\ExcelFiles\SingleTestData.xlsx
		
	}

}
