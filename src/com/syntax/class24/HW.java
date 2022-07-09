package com.syntax.class24;

public class HW {
    /*
    Create a class File that will have the following behaviors: open, edit, close. Edit and close are implemented method
    while open is an abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation
    of open behaviour: Example: to open .java file we need notepad++ or sublime text, to open .doc file we need
    Microsoft word to be installed etc
     */
}
 abstract class File{
   abstract void open();

     void edit(){
         System.out.println("editing data file");
     }
     void close(){
         System.out.println("closing data file");
     }


}
class JavaFile extends File{
    @Override
    void open() {
        System.out.println("to open .java file we need Eclipse or Intellij");
    }
}
class WordFile extends File{
    @Override
    void open() {
        System.out.println("to open .doc file we need Microsoft Word to be installed");
    }
}
class  PdfFile extends File{
    @Override
    void open() {
        System.out.println("to open .pdf file  we need Adobe Acrobat Reader or any alternative PDF reader to be installed");
    }
}
class FileTester{
    public static void main(String[] args) {

        File file= new JavaFile();// == new JavaFile().open();
        file.open();
        //file.edit();
        //file.close();

        System.out.println("=========================================================================================");
        File[]files={new JavaFile(),new WordFile(),new PdfFile()};
        for (int i=0;i<files.length;i++){
            files[i].open();
           files[i].edit();
            files[i].close();
        }
        System.out.println("=========================================================================================");
        for (File newfile:files){
            newfile.open();
          //  newfile.edit();
          //  newfile.close();
        }

    }
}
