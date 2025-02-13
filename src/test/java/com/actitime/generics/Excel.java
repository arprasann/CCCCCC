package com.actitime.generics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{

public static int getRowCount(String path,String sheet)
	{
int rc=0;
try
{
	FileInputStream fis=new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	       rc=wb.getSheet(sheet).getLastRowNum();
}
catch(Exception e)
{
	System.out.println("We are getting Exception"+e);	
	}
return rc;
}

//----------------------------------------------------
public static String getCellValue(String path,String sheet,int row,int cell)
{
String value ="";
try {
	FileInputStream fis=new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	value = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
	
} catch (Exception e) {
	System.out.println("We are getting Exception"+e);
}
	return value;
}
}
