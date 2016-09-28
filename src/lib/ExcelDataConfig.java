package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public ExcelDataConfig(String excelpath) throws Exception
	{
		try {
			File src=new File(excelpath);
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			sheet=wb.getSheetAt(2);
		} 
		catch (Exception e)
		{
		
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public String getData(int i,int j,int k)
	
	{
		sheet=wb.getSheetAt( i);
		String data=sheet.getRow(i).getCell(j).getStringCellValue();

		return data;
	}

}
