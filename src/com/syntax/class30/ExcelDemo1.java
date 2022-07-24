package com.syntax.class30;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo1 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Ro\\Desktop\\ExcelDemo.xlsx";////location of file on the computer
        FileInputStream fileInputStream = new FileInputStream(path);// navigate tot the file location
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);//class that understands how Excel files work
        Sheet sheet = workbook.getSheet("Sheet1");// accessing data,// Excel files are divided in sheets we can
                                                       // access any sheet by providing its name
        // sheet have rows and cells(columns) we need to specify the row number and cell number as well
        // rows and columns they also start from index zero
        // Number of rows that contain the data.
        //if we want to read the data we need to know the size of rows and columns to loop through them and get all the info
        int numbOfRows = sheet.getPhysicalNumberOfRows();//number of rows that contain the data

        System.out.println(numbOfRows);
        for (int i = 0; i < numbOfRows; i++) {//getting row 1by1 using for loop
            Row row = sheet.getRow(i);
            // Cell cell=row.getCell(0);
            //System.out.println(cell);//thats how we get all rows ONLY
            int noOfCells = row.getPhysicalNumberOfCells();

            for (int j = 0; j < noOfCells; j++) {
                System.out.print(row.getCell(j) + " ");
            }
            System.out.println();
        }

    }
}
