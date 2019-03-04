package firstt;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class datadriven1 
{
	@Test
	public void b1() throws Exception
	{
		FileInputStream fis = new FileInputStream("./data/sun.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet shee = wb.getSheet("Sheet1");
		Row firstRow = shee.getRow(0);
//		int rowCount = shee.getPhysicalNumberofRows();
		int rc = shee.getLastRowNum();
		for(int i=0; i<=rc; i++)
		{
			for(int j=0; j<firstRow.getLastCellNum(); j++)
			{
				Cell cell = shee.getRow(i).getCell(j);
				System.out.println(cell);
			}
		}
		
	}
	
	

}
