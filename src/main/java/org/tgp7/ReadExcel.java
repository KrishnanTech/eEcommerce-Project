package org.tgp7;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public  static  String[][] readExcel(String sheet) throws IOException {

		//set the path for excel work sheet
		XSSFWorkbook wb = new XSSFWorkbook("./Data_tgp7/Lead.xlsx");

		//get into the sheet
		XSSFSheet ws = wb.getSheet(sheet);

		//getlast row number without header
		int lRow = ws.getLastRowNum();
		System.out.println(lRow);
		
		int pRows = ws.getPhysicalNumberOfRows();
	//	System.out.println(pRows);
		
		//getlast cell number without header
		short lCell = ws.getRow(0).getLastCellNum();
		System.out.println(lCell);

		String[][] data = new String[lRow][lCell];
		//getting no of cells from header
		int pCell = ws.getRow(0).getPhysicalNumberOfCells();
		for (int i = 1; i <=lRow; i++) {
			XSSFRow row = ws.getRow(i);

			for (int j = 0; j <lCell; j++) {
				XSSFCell cell = row.getCell(j);

				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
				
				data[i-1][j] = cellValue;
				
				
				
			}
		}
	wb.close();
	return data;
		


	}
}
