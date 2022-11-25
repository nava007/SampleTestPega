package selenium;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {
	
	ReadExcel excel;
	
  @DataProvider(name="testdata")
  public Object[][] getdata() throws IOException {
	  
	  excel=new ReadExcel();
	  Object ob1[][]=excel.readexcel("E:\\Test.xlsx", 0);
	  return ob1;
	  
  }
  
  @BeforeTest
  public void start() {
	  System.out.println("START");
  }
  
  @Test(dataProvider="testdata",priority=0)
  public void displaydata(String Empname, String EmID, String Place) {
	  
	  System.out.println("Employee Name is"+"  "+Empname);
	  System.out.println("Employee Name is"+"  "+EmID);
	  System.out.println("Employee Name is"+"  "+Place);
  }
  
  @Test(priority=1)
  public void second() {
	  
	  System.out.println("SECOND METHOD");
	 
  }
  
  @AfterTest
  public void end() {
	  System.out.println("END");
  }
}
