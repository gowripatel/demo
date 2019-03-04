package firstt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class Excel 
{
	@DataProvider
	public String[][] method() throws EncryptedDocumentException, InvalidFormatException, IOException  
	{
		FileInputStream fis = new FileInputStream("./inputdata/input.xlsx");
				Workbook wb = WorkbookFactory.create(fis);
		Sheet sht = wb.getSheet("sheet1");
		Row row = sht.getRow(0);
		int rcount = sht.getPhysicalNumberOfRows();
		int cn = row.getLastCellNum();
		
		System.out.println(cn);
		
		String [][] str= new String[rcount-1][cn];
		
		for(int i =1; i < rcount;i++)
		{
			for(int j = 0; j<row.getLastCellNum(); j++)
			{
				Cell cell = sht.getRow(i).getCell(j);
				
				str[i-1][j] = cell.toString();
				
				
			
			}
		}
		
		return str;
	}
	@Test(dataProvider = "method")
	public void testt(String s1, String s2)
	{
		System.out.println(s1);
		System.out.println(s2);
		
	}
}

