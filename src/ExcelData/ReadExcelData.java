package ExcelData;

import lib.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		ExcelDataConfig excel=new ExcelDataConfig("D:\\sampleexceldata.xlsx");
		System.out.println(excel.getData(1, 0, 1));
	}

}
