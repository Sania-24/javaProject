package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	public static void main(String args[]) throws Exception {
		getRowCount();
		getCellData();
	}
	public static void getCellData()throws IOException{
		 
			  String projDir=System.getProperty("user.dir");
			  System.out.println(projDir);
		  String excelPath=projDir+"/data/TestData.xlsx";
		  XSSFWorkbook workbook=new XSSFWorkbook(excelPath);
		  XSSFSheet sheet=workbook.getSheet("Sheet1");
		  String value=sheet.getRow(1).getCell(0).getStringCellValue();
		  System.out.println(value);
	}
  public static void getRowCount() {
	  
	  try {
		  String projDir=System.getProperty("user.dir");
		  System.out.println(projDir);
	  String excelPath=projDir+"/data/TestData.xlsx";
	  XSSFWorkbook workbook=new XSSFWorkbook(excelPath);
	  XSSFSheet sheet=workbook.getSheet("Sheet1");
	  int rowCount=sheet.getPhysicalNumberOfRows();
	  System.out.println("No of Rows"+" "+rowCount);
	  }catch(Exception e) {
		  System.out.println(e.getCause());
		  System.out.println(e.getMessage());
		  e.printStackTrace();
	  }
  }
}
