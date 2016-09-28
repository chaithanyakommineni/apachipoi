
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	public class readexceldatasircode {
	
		public static void main(String[] args) throws IOException, InvalidFormatException {
			
			XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(new File("C:\\Users\\chaitu\\Downloads\\Chaitanya.Daily Tracker (4).xlsx")));
			XSSFSheet sheet = workbook.getSheet("Week1 01.08.16");
		
			int rows = sheet.getLastRowNum();
			for(int i=0;i<rows;i++){
				XSSFRow row = sheet.getRow(i);
				int cellscount = row.getLastCellNum();
				 for(int j=0;j<cellscount;j++){
					 XSSFCell cell = row.getCell(j);
					 System.out.println("Data in row,cell:"+i+","+j+" is :"+cell.getStringCellValue());
				 }
			}
			workbook.close();
		}
	}


