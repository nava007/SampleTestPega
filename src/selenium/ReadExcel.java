package selenium;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
    Object ob[][];
	public Object[][] readexcel(String path, int index) throws IOException {
		
		workbook =new XSSFWorkbook(path);
		sheet= workbook.getSheetAt(index);
		
		int rownum=sheet.getPhysicalNumberOfRows(); 
		System.out.println("Total number of rows"+"  "+rownum);		
		int col=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Total number of rows"+"  "+col);
		
		ob=new Object[rownum-1][col];
		
		for(int i=1;i<rownum;i++) {
			
			for(int j=0;j<col;j++) {
				
				String str=sheet.getRow(i).getCell(j).getStringCellValue();
				
				
				ob[i-1][j]=str;
				System.out.println(ob[i-1][j]);
			}
			
		}
		return ob;
		
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		ReadExcel test=new ReadExcel();
		
		
		test.readexcel("E:\\Test.xlsx", 0);
		
	}

}
