package firstt;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadriven3 
{
	@DataProvider
	public String[][] b1() throws Exception
	{
		FileInputStream fis = new FileInputStream("./data/sun.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet shee = wb.getSheet("Sheet1");
		Row firstRow = shee.getRow(0);
		int rowCount = shee.getPhysicalNumberOfRows();
		int cc = firstRow.getLastCellNum();
		
		String [][] str = new String[rowCount-1][cc];
		
		for(int i=1; i<rowCount; i++)
		{
			for(int j=0; j<firstRow.getLastCellNum(); j++)
			{
				Cell cell = shee.getRow(i).getCell(j);
//				System.out.println(cell);
				
				str[i-1][j]=cell.toString();
//				System.out.println(str[i-1][j]);
			}
		}
		return str;
	}
	
	@Test(dataProvider="b1")
	public void b2(String s, String s1)
	{
		System.out.println(s);
		System.out.println(s1);
	}

}
