package utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class writeExcel {

	  public void WriteExcel(String sheetName, String cellvalue, int row, int col) throws Exception{
	   String excelPath="C:\\Users\\sri\\eclipse-workspace\\Excelutility\\data\\TestData.xlsx";
	    File file=new File(excelPath);
	    FileInputStream fis=new FileInputStream(file);
	    XSSFWorkbook wb=new XSSFWorkbook(fis);
	    XSSFSheet sheet=wb.getSheet(sheetName);
	    sheet.getRow(row).getCell(col).setCellValue(cellvalue);
	    FileOutputStream fos=new FileOutputStream(new File(excelPath));
	     wb.write(fos);
	     wb.close();
	     fos.close();
	     
	    
	    }
}