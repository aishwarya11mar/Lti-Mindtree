package com.LtiMindtree.excel;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.LtiMindtree.model.Student;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UserExcelImporter {
	public List<Student> excelImport(){
		List<Student> listStudent=new ArrayList<>();
		long sid=0;
		String sname="";

		String excelFilePath="C:\\Users\\USER\\student.xlsx";
		FileInputStream inputStream;
		try {
			inputStream = new FileInputStream(excelFilePath);
			Workbook workbook=new XSSFWorkbook(inputStream);
			Sheet firstSheet=workbook.getSheetAt(0);
			Iterator<Row> rowIterator=firstSheet.iterator();
			rowIterator.next();
			
			while(rowIterator.hasNext()) {
				Row nextRow = rowIterator.next();
				Iterator<Cell> cellIterator=nextRow.cellIterator();
				while(cellIterator.hasNext()) {
					Cell nextCell=cellIterator.next();
					int columnIndex=nextCell.getColumnIndex();
					switch (columnIndex) {
					case 0:
						sid=(long)nextCell.getNumericCellValue();
						System.out.println(sid);
						break;
					case 1:
						sname=nextCell.getStringCellValue();
						System.out.println(sname);
						break;

					
					}
					listStudent.add(new Student(sid, sname));
				}
			}
			
			workbook.close();

			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		return listStudent;
	}

}
