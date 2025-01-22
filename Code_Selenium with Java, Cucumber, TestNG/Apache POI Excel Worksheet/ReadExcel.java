package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws IOException {
	//	FileInputStream fs = new FileInputStream("C:/Users/Amol/Desktop/Excel_Data.xlsx");   
		FileInputStream fs = new FileInputStream("./ExcelData/Excel_Data.xlsx");   

		System.out.println("Read Excel");		
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet1 = wb.getSheetAt(0);	
		
		//get row count
		int totalRows = sheet1.getLastRowNum() + 1;
		System.out.println("Total Row="+totalRows);
		
		//get column count
		int totalCells = sheet1.getRow(0).getLastCellNum();
		System.out.println("Total Column="+totalCells);
		
		
		for(int currentRow = 0; currentRow<totalRows ; currentRow++)
		{
			for(int currentCell = 0; currentCell<totalCells ;  currentCell++)
			{
				System.out.print(sheet1.getRow(currentRow).getCell(currentCell).toString());
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		
		System.out.println("----------------------------------------------------");
		
		
		//Print row and column value by giving row and column index
//		String data0 =sheet1.getRow(0).getCell(0).getStringCellValue();
//		System.out.println("Data from Excel: "+data0);
//		String data1 =sheet1.getRow(0).getCell(1).getStringCellValue();
//		System.out.println("Data from Excel: "+data1);
//		String data2 =sheet1.getRow(1).getCell(0).getStringCellValue();
//		System.out.println("Data from Excel: "+data2);
//		String data3 =sheet1.getRow(1).getCell(1).getStringCellValue();
//		System.out.println("Data from Excel: "+data3);
//		System.out.println("-----------------------------------------------------------");
		
		
		 System.out.println("Read Excel sheet successfully");
		wb.close();	
	}
	}


