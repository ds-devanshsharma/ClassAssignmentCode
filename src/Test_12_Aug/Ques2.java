package Test_12_Aug;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ques2 {
    public static void setData(FileOutputStream fileOutputStream , String string) throws IOException {
        fileOutputStream.write(string.getBytes());
    }
    public static void printDataOnConsole(FileInputStream fileInputStream) throws IOException {
        int i =0;
        while((i=fileInputStream.read())>0){
            System.out.print((char)i);
        }
    }
    public static void writeData(FileInputStream fileInputStream,FileOutputStream writableFile) throws IOException {
        int i=0;
        while((i=fileInputStream.read())>0){
            writableFile.write((char)i);
        }
    }

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\coditas\\Desktop\\DevanshCode\\FileHandling\\Test.txt");
        if(file.createNewFile())
            System.out.println("File Test.txt created !!");
        else
            System.out.println("SomeThing went wrong !!");
        //checking existance of file
        //check(file);

        String string1 = "Hi am Genious \n";
        String string2 = "Hi i am Devansh \n";
        String string3 = "I love india \n";
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users" +
                "\\coditas\\Desktop\\DevanshCode\\FileHandling\\Test.txt");
        // setData
        setData(fileOutputStream , string1);
        setData(fileOutputStream , string2);
        setData(fileOutputStream , string3);

        // printng on console
        FileInputStream fileInputStream = new FileInputStream(
                "C:\\Users\\coditas\\Desktop\\DevanshCode\\FileHandling\\Test.txt");
        printDataOnConsole(fileInputStream);

        // creating four files


        FileOutputStream writableFile ;
        writableFile  = new FileOutputStream("C:\\Users\\coditas\\Desktop\\DevanshCode\\FileHandling\\A.txt");
        writeData(fileInputStream,writableFile);
        writableFile  = new FileOutputStream("C:\\Users\\coditas\\Desktop\\DevanshCode\\FileHandling\\B.txt");
        writeData(fileInputStream,writableFile);
        writableFile  = new FileOutputStream("C:\\Users\\coditas\\Desktop\\DevanshCode\\FileHandling\\C.txt");
        writeData(fileInputStream,writableFile);
        writableFile  = new FileOutputStream("C:\\Users\\coditas\\Desktop\\DevanshCode\\FileHandling\\D.txt");
        writeData(fileInputStream,writableFile);
        // writing into Files A.txt | B.Txt | C.txt | D.txt


    }
}
