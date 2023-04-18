package DataDrivenPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.binary.XSSFBCommentsTable;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\NEVEDHA\\eclipse-workspace\\DataDrivenFramework\\target\\ExcelData.xlsx");
		
		FileInputStream input = new FileInputStream(f);
		
		XSSFWorkbook w = new XSSFWorkbook(input);
		
		XSSFSheet s = w.getSheet("Sheet1");
		
		for(int i = 0; i < s.getPhysicalNumberOfRows(); i++)
		{
			XSSFRow row = s.getRow(i);
			
			for(int j = 0; j < row.getPhysicalNumberOfCells(); j++)
			{
				XSSFCell cell = row.getCell(j);
				System.out.println(cell);
			}
		}
	}
}
