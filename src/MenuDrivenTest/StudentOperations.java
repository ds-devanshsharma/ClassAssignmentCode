package MenuDrivenTest;

import java.util.Arrays;
import java.util.Scanner;

public class StudentOperations {
    int id;
    String firstName;
    String lastname ;
    String city;
    String contact;
    static int countRecord ;
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
        array[count] =new Student(id,firstName,lastname,city,contact);
        System.out.println("Record "+ (count+1) + " Added succesfully !!");
        System.out.println("----------------------------------------------------------------------------");
    }
    public void fetchAllData(Student[] array ){
        System.out.println("Records of Students !!");

        for(int i =0; i<array.length ; i++){
            if(array[i] != null) {
                countRecord++;
                System.out.println(array[i].toString());
            }
        }
        if(countRecord == 0) System.out.println("NO RECORD FOUND !!");
        System.out.println("-----------------------------------------------------------------------------");
    }
    //This fetchData() is made to fetch data based on id
    public static void fetchData(Student[] array , int updateId  ){
        System.out.println("Your last updated Data !!");
        System.out.println(array[getIndex(array,updateId)].toString());
    }
//    static int getCountRecord(Student[] array){
//        for(Student student : array){
//            if(student.firstName != null)
//                countRecord++;
//        }
//        return countRecord ;
//    }
    public static int getIndex(Student[] array ,int id){
        int index = 0;
        for(int i=0 ;i <array.length ;i++){
                if(array[i] !=null)
                    if(id == array[i].id ) index = i;
        }
        return index;
    }
    public void updateData(Student[] array ,Scanner scanner){
//        if(getCountRecord(array) ==0){
//            System.out.println("NO RECORD FOUND !!");
//            countRecord =0;
//            MainDriver.showMenu(scanner,array);
//        }
        System.out.println("Enter your ID :");
        int updateID= scanner.nextInt();
        fetchData(array , updateID);
        // catching that index where we want to perform updation
        int index = getIndex(array, updateID);

        int loopBreak=1;
        // this loop will give chance to user to change data fields multiple times!
        while(loopBreak !=0) {
            System.out.println("Which field you want to edit !!\nEnter 1 for id \nEnter 2 firstName \n" +
                    "Enter 3 for lastName \nEnter 4 for city \nEnter 5 for contact \nEnter 0 for exit !! ");
            int editChoice = scanner.nextInt();

            switch (editChoice) {
                case 0:
                    System.out.println("Now you are out from updateMenu !!");
                    loopBreak= 0;
                    break;
                case 1 :
                    System.out.println("Enter ID : ");
                    //setting updated data to that index
                    array[index].id = scanner.nextInt();
                    System.out.println("Your ID updated succesfully !!");
                    //showing data after updation
                    fetchData(array , updateID);
                    break;
                case 2 :
                    System.out.println("Enter FirstName : ");
                    scanner.nextLine();
                    array[index].firstName = scanner.nextLine();
                    System.out.println("Your FirstName updated succesfully !!");
                    fetchData(array , updateID);
                    break;
                case 3 :
                    System.out.println("Enter LastName : ");
                    scanner.nextLine();
                    array[index].lastname = scanner.nextLine();
                    System.out.println("Your LastName updated succesfully !!");
                    fetchData(array , updateID);
                    break;
                case 4 :
                    System.out.println("Enter city : ");
                    scanner.nextLine();
                    array[index].city = scanner.nextLine();
                    System.out.println("Your City updated succesfully !!");
                    fetchData(array , updateID);
                    break;
                case 5 :
                    System.out.println("Enter contact : ");
                    scanner.nextLine();
                    array[index].contact = scanner.nextLine();
                    System.out.println("Your City updated succesfully !!");
                    fetchData(array , updateID);
                    break;
                default:
                    System.out.println("Something Went Wrong !!");
                    break;
            }
        }
        System.out.println("Data updated Succesfully \n ----------------------------------------------------------");
    }
    public void removeData(Student[] array ,Scanner scanner ){
//        if(getCountRecord(array) ==0){
//            System.out.println("NO RECORD FOUND !! ");
//            countRecord =0;
//            MainDriver.showMenu(scanner,array);
//        }
        System.out.println("Enter id which you want to delete !!");
        int removeID = scanner.nextInt();
        array[getIndex(array,removeID)] = null;
        System.out.println("Data Removed Successfully !!");
        System.out.println("------------------------------------------------------------------------------");
    }
}
/*

 */