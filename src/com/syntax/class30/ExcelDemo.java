package com.syntax.class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

import java.io.IOException;

public class ExcelDemo {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Ro\\Desktop\\ExcelDemo.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);// navigate tot the file location
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);//class that understands how Excel files work
        Sheet sheet=workbook.getSheet("Sheet1");// accessing data (sheets)
        // sheet have rows and cells(columns) we need to specify the row number and cell number as well
        // rows and columns they also start from index zero
        Row row=sheet.getRow(1);
        Cell cell= row.getCell(0);
        System.out.println(cell);
      fileInputStream.close();





    }
}
