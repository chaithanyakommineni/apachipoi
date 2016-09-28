package ExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static void main(String[] args) throws IOException {
		File src=new File("D:\\sampleexceldata.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheetAt(1);
	int rowcount=sheet.getLastRowNum();
	System.out.println("total rows is"+rowcount);
	//System.out.println("total rows is"+rowcount+1);
	for(int i=0;i<rowcount;i++)
	{
	String data=	sheet.getRow(i).getCell(0).getStringCellValue();
		System.out.println("test data from excel is"+i+"is"+data);
	}
	wb.close();
		
	}

}
