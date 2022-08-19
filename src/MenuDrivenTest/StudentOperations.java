package MenuDrivenTest;

import java.util.Arrays;
import java.util.Scanner;

public class StudentOperations {


    int id;
    String firstName;
    String lastname ;
    String city;
    String contact;
    public void addData(Scanner scanner , Student[] array, int count){
        System.out.println("Enter id : ");
        id =scanner.nextInt();
        System.out.println("Enter firstName : ");
        scanner.nextLine();
        firstName = scanner.nextLine();
        System.out.println("Enter lastName : ");
        lastname = scanner.nextLine();
        System.out.println("Enter city : ");
        city = scanner.nextLine();
        System.out.println("Enter contact : ");
        contact = scanner.nextLine();
        array[count++] =new Student(id,firstName,lastname,city,contact);
        System.out.println("Record "+ count + " Added succesfully !!");
    }
    public void fetchAllData(Student[] array ){
        System.out.println("details of Student !!");
        System.out.println(Arrays.toString(array));
    }
    public static void fetchData(Student[] array , int id  ){

        System.out.println(Student.toString(array,id));
    }
    public static int getIndex(Student[] array ,int id){
        int index = 0;
        for(int i=0 ;i <array.length ;i++){
                if(id == array[i].id) index = i;
        }
        return index;
    }
    public void updateData(Student[] array ,Scanner scanner){
        System.out.println("Enter your ID :");
        int updateID= scanner.nextInt();
        fetchData(array , updateID);
        System.out.println("Which field you want to edit !!\n Enter 1 for id \nEnter 2 firstName \nEnter 3 for " +
                "lastName \n Enter 4 for city \n Enter 5 for contact ");
        int editChoice = scanner.nextInt();
        for(Student student : array) {
//            if(student)
        }
        switch(editChoice){
            case 1 :

        }


    }
    public void removeData(Student[] array ,Scanner scanner ){
        System.out.println("Enter id which you want to delete !!");

    }
}
