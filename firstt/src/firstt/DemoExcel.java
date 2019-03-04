package firstt;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoExcel {

	@DataProvider
	public  String[][] data() throws Exception {
		FileInputStream excel = new FileInputStream("./testdata/logindata.xlsx");
		Workbook wb = WorkbookFactory.create(excel);
		Sheet sheet = wb.getSheet("Sheet1");
		Row firstRow = sheet.getRow(0);
		int rowCount = sheet.getPhysicalNumberOfRows();
		String[][] s = new String[rowCount-1][firstRow.getLastCellNum()];
		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < firstRow.getLastCellNum(); j++) {
				Cell cell = sheet.getRow(i).getCell(j);
//				System.out.println(cell);
				s[i-1][j] = cell.toString();
//				System.out.println(s[i-1][j]);
			}
		}
		return s;
	}
	
//	@Test(dataProvider="data")
//	public void databank(String un,String pwd)
//	{
//		System.out.println(un+" and "+pwd);
//	}
}
