package actions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class TestForExcel extends ExcelReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		//TestForExcel.readExceldata();
		TestForExcel.excelObject();
		
		
	}
	
	public static void readExceldata() {
		 List<Map<String, String>> dataList = null;
		try {
			 dataList	=getDataTable("src/test/resources/data.xlsx", "Sheet1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Map<String, String> ab : dataList) {
			if(ab.size()==4) {
				System.out.println(ab.get("Name"));
				System.out.println(ab.get("Email"));
				System.out.println(ab.get("Expected Text"));
			}
		}
		
	}
	
	public static void excelObject() throws IOException {
		
		Object[][] data = myExcelData();
		
		System.out.println(data.toString());
		
	}


}
