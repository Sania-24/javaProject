package testcases;

import org.junit.Test;

import utils.writeExcel;
public class writeExcelTest {
	writeExcel obj=new writeExcel();
	
	@Test
	public void WriteExcelTest()throws Exception {
		obj.WriteExcel("test", "female",0, 2);
	}
	@Test
	public void WriteExcelTest1()throws Exception {
		obj.WriteExcel("test", "female",2, 2);
	}
}
