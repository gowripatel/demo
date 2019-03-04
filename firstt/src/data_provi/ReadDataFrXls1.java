package data_provi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadDataFrXls1 {

	
	@DataProvider
	public String[][] normaltestcase() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream("F:\\dataprodemo.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		
		Sheet shee = wb.getSheet("Sheet1");
		Row firstRow= shee.getRow(0);
		
		//System.out.println("firstRow:"+firstRow);
		//System.out.println(firstRow.getLastCellNum());
		int rowCount = shee.getPhysicalNumberOfRows();
		System.out.println("getPhysicalNumberOfRows:"+rowCount);
		int colCount = firstRow.getLastCellNum();
		System.out.println("getLastCellNum:"+colCount);
		
		String[][] arr=new String[rowCount-1][colCount];
		for(int i=1;i<rowCount;i++)
		{
		for(int j=0;j<firstRow.getLastCellNum();j++)
		{
			Cell cell = shee.getRow(i).getCell(j);
			//System.out.println(cell);
			arr[i-1][j]=cell.toString();
			System.out.println(arr[i-1][j]);
			
		}
		}
		return arr;
		
		
	}
	@Test(dataProvider="normaltestcase")
	public void test(String s,String s2)
	{
		System.out.println(s);
		System.out.println(s2);
	}
}
