import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class sampleprogram {
WebDriver driver;
public Object[][] getusernameandpassword() throws FileNotFoundException, IOException
{
	Properties props=new Properties();
	props.load(new FileInputStream(new File("Sample.properties")));
	int size=props.size();
	String[][] str=new String[size/2][2];
	for(int i=0;i<size/2;i++)
	{
		str[i][0]=props.getProperty("username"+i);
		str[i][1]=props.getProperty("password"+i);
	}
	return str;
	
}
public class excel
{
	WebDriver driver;
	
	File src=new File("path");
	//FileInputStream str=new FileInputStream(src);
	XSSFWorkbook workbook=new XSSFWorkbook();
}

}
