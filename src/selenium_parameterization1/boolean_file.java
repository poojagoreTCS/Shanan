package selenium_parameterization1;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class boolean_file {
	public static void main(String[] args) throws Throwable {
		FileInputStream file=new FileInputStream("C:\\Users\\POOJA GORE\\Documents\\parameterization.xlsx");
		Thread.sleep(3000);
	boolean data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(4).getBooleanCellValue();	
	 System.out.println(data);
		
	}

}
