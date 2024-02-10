package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReaddataFromExcel {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\WIN 10.DESKTOP-VBBJ1UA\\git\\SeleniumAug23_git\\src\\test\\resources\\data.xlsx");
		Workbook workbook = new XSSFWorkbook(fis);		
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(cell.getStringCellValue());
		
		
		
		
	}

}
