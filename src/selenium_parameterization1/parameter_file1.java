package selenium_parameterization1;


import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class parameter_file1 {
	public static void main(String[] args) throws Throwable {
		FileInputStream file=new FileInputStream("C:\\Users\\POOJA GORE\\Documents\\parameterization.xlsx");
	    String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
	}

}
