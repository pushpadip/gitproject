package exelshit;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exelshitalldata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException{
		
		FileInputStream x = new FileInputStream("G:/dss class/softwere/exelile/abc.xlsx");
		Sheet a = WorkbookFactory.create(x).getSheet("Sheet1");
		
		int rowno = a.getPhysicalNumberOfRows();
		
		for(int i=0; i<rowno;i++)
		{
			int cellno = a.getRow(i).getPhysicalNumberOfCells();
			
			for(int j=0; j<cellno; j++)
			{
				String ss = a.getRow(i).getCell(j).getStringCellValue();
				System.out.print(ss+" ");
			}
			System.out.println();
		}
	}

}
