import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DD {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C://Users//853523//Downloads//DemoData.xlsx"); // To
																									// read
																									// any
																									// file
		XSSFWorkbook workbook = new XSSFWorkbook(fis); // Creating an Object for a workbook --> To get access to the
														// excel
														// XSSFWorkbook accepts FileInputStream Argument.

		int sheets = workbook.getNumberOfSheets(); // Count of sheets --is an Integer
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("TestData")) {
				XSSFSheet sheet = workbook.getSheetAt(i);

				// Identify Test Cases Column by scanning entire 1st row

				Iterator<Row> rows = sheet.iterator();// For sheet iteration we used Iterator -- sheet is a collection
														// of rows
				Row Firstrow = rows.next();
				Iterator<Cell> cell = Firstrow.cellIterator(); // For cell iteration -- row is a collection of cells

				int k = 0;
				int column = 0;
				while (cell.hasNext()) {
					Cell value = cell.next();
					if (value.getStringCellValue().equalsIgnoreCase("TestData")) {
						column = k;
					}
					k++;
				}
				System.out.println(column);

				// Once Column is identified then scan entire test case column to identify
				// purchase test case row
				while (rows.hasNext()) {

					Row r = rows.next();
					r.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase");
				}
			}
		}

	}

}
