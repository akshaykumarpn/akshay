package generic_script;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_Excel {

	public static String getdata(String Sheet,int row,int cell ) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./poi_excel/hybrid frame.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Cell cel = book.getSheet(Sheet).getRow(cell).getCell(cell);
		
		String val = cel.toString();
		return val;
}
}