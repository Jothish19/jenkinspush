package DataDrivenPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\NEVEDHA\\eclipse-workspace\\DataDrivenFramework\\target\\emptyexcel.xlsx");
		boolean write = f.canWrite();
		System.out.println(write);
		
		XSSFWorkbook w = new XSSFWorkbook();
		
		XSSFSheet s = w.createSheet("Hello");
		
		XSSFRow r = s.createRow(0);
		
		r.createCell(2).setCellValue("Hello All");
			
		FileOutputStream output = new FileOutputStream(f);
		
		w.write(output);
				
	}
}
