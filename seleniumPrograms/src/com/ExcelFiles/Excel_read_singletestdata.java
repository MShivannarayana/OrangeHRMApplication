package com.ExcelFiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_read_singletestdata {
	public static <TestDataRow> void main(String[] args) throws IOException {
		FileInputStream excelTestDataFile=new FileInputStream("./src/com/ExcelFiles/Single.xlsx");
				XSSFWorkbook WorkBook=new XSSFWorkbook(excelTestDataFile);
		XSSFSheet Sheet=WorkBook.getSheet("Sheet1");
		Row sheetofRow=Sheet.getRow(0);
		Cell rowofcell=sheetofRow.getCell(0);
		String testData=rowofcell.getStringCellValue();
		System.out.println("the data  in the  row of cell is:-"+testData);
		
		
		
	}
	}


