package com.syntax.class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo2 {
    /*HOW TO CREATE EXCEL FILES USING APACHE POI AND JAVA
     */
    public static void main(String[] args) throws IOException {
        String path="Files/DemoFile.xlsx";

        XSSFWorkbook workbook=new XSSFWorkbook();//special class that knows how to handle Excel files
        Sheet sheet=workbook.createSheet("Agraba");
        Row row=sheet.createRow(0);
        Cell cell=row.createCell(0);
        cell.setCellValue("Aladdin");

        FileOutputStream fileOutputStream=new FileOutputStream(path);
        workbook.write(fileOutputStream);
        fileOutputStream.close();


        }

    }
