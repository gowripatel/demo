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
import org.testng.annotations.Test;

public class ReadDataFrXls {
	
	@Test
	public void normaltestcase() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream("F:\\dataprodemo.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		
		Sheet shee = wb.getSheet("Sheet1");
		Row row = shee.getRow(1);
		Cell cel = row.getCell(0);
		System.out.println(cel.toString());
		//or
		//System.out.println(cel);
	}

}
