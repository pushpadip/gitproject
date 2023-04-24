package exelshit;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exelshit {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream excel = new FileInputStream("G:/dss class/softwere/exelile/abc.xlsx");
	
		org.apache.poi.ss.usermodel.Sheet a =  WorkbookFactory.create(excel).getSheet("Sheet1");
		
		String b = a.getRow(0).getCell(0).getStringCellValue();
		String c = a.getRow(0).getCell(1).getStringCellValue();
		String d = a.getRow(3).getCell(1).getStringCellValue();
		Thread.sleep(2000);
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(b+" "+c);
		System.out.println(d);

	}
}
