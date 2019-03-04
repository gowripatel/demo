package firstt;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testxl {
@DataProvider
public String [][] testxl () throws Exception {
	FileInputStream fis=new FileInputStream("D:\\xlfile\\one.xlsx");

	Workbook wb=WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("sheet1");
	Row firstrow = sheet.getRow(0);
	System.out.println(firstrow);
	System.out.println(firstrow.getLastCellNum());
	int rowcount=sheet.getPhysicalNumberOfRows();
	System.out.println(rowcount);
	int colcount=firstrow.getLastCellNum();
	System.out.println(colcount);
	String [][]arr=new String [rowcount-1][colcount];
	for(int i=1;i<rowcount;i++)
	{
		for(int j=0;j<firstrow.getLastCellNum();j++)
		{
			Cell cell = sheet.getRow(i).getCell(j);
			arr[i-1][j]=cell.toString();
			
		}
	}
	return arr;
	
}

@Test(dataProvider="testxl")
public void test(String s1,String s2)
{
	System.out.println(s1);
	System.out.println(s2);
}
}
