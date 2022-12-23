package genericLib;
/***
 * 
 * @author devaraj.shirur
 *
 */
public class Constants {
	static String EXCELPATH = "./src/test/resources/TestData.xlsx";

	//Read DATA from EXCEL File
	static String URL = ExcelLib.readStringData("Sheet1", 0, 0);
	static String CHROMEKEY = ExcelLib.readStringData("Sheet1", 0, 2);
	static String CHROMEPATH = ExcelLib.readStringData("Sheet1", 1, 2);
	public static String USERNAME =ExcelLib.readStringData("Sheet1", 0, 1);
	public static String PASSWORD =ExcelLib.readStringData("Sheet1", 1, 1);
}
