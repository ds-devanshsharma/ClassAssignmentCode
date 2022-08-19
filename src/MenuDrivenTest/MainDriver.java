package MenuDrivenTest;

import java.util.Scanner;

public class MainDriver {
    static int count ;
    static void showMenu(Scanner scanner, Student[] array ){
        System.out.println("Enter 1 for InsertData!!");
        System.out.println("Enter 2 for updateData!!");
        System.out.println("Enter 3 for removeData!!");
        System.out.println("Enter 4 for fetchAll !!");
        System.out.println("Enter 5 for Exit !!");
        System.out.println("Enter your choice : ");
        int choice =scanner.nextInt();
        switch (choice){
            case 5 :
                System.exit(0);
            case 1 :
                new StudentOperations().addData(scanner,array,count );
                break;
            case 2 :
                new StudentOperations().updateData(array,scanner);
                break;
            case 3 :
                new StudentOperations().removeData(array,scanner);
                break ;
            case 4 :
                new StudentOperations().fetchAllData(array );
                break;
        }
    }
    public static void main(String[] args) {
        System.out.println("Student System !");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many record you gonna enter !!");
        int records = scanner.nextInt();
        Student[] array = new Student[records];

        while(true){
            showMenu(scanner,array);
        }
    }
}
