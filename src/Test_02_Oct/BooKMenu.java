package Test_02_Oct;

import Test_02_Oct.DAOBook.DAOBookImplementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class BooKMenu {
   static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

   void bookMenu() throws IOException {
       try{
            System.out.println("\nEnter 1 for InsertData :\n" +
                    "Enter 2 for updateData :\n" +
                    "Enter 3 for showData :\n" +
                    "Enter 4 for DeleteData :\n" +
                    "Enter 5 to View SortedData :\n" +
                    "Enter 6 for lastCase :" +
                    "Enter 0 to Exit :\n");
            switch (Integer.parseInt(reader.readLine())) {
                case 1:
                    new DAOBookImplementation().insertData();
                    break;
                case 2:
                    new DAOBookImplementation().updateData();
                    break;
                case 3:
                    new DAOBookImplementation().showData();
                    break;
                case 4:
                    new DAOBookImplementation().deleteData();
                    break;
                case 5:
                    new DAOBookImplementation().showBasedOnSorting();
                    break;
                case 6 :
                    new DAOBookImplementation().lastCase();
                    break;
                case 0 :
                    System.out.println("Logged OUt ");
                    System.exit(0);
                default:
                    System.out.println("INPUT MISS_MATCHED ");
            }
        }catch(Exception e){
           System.out.println(e.getMessage());
           bookMenu();
        }

    }
}
