package Practice.EmployeeSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeSystemDriver  {
    static int count;

    static List<Employee> list = new ArrayList<>();

     static void showMenu(Scanner scanner){
        System.out.println("0) Exit\n" +
                "1) Add an employee\n" +
                "2) Show all employees\n" +
                "3) Promote employee to manager\n" +
                "4) Show all managers\n");
       int  choice= scanner.nextInt();
        switch (choice){
            case 0 :
                System.out.println("You have Logged out Successfully !!");
                System.exit(0);
            case 1 :
                new AddEmployee().addData(scanner);
                count++;
                break;
            case 2 :
                new ShowEmployee().showData(list,scanner);
                break;
            case 3 :
                new PromoteEmployee().promoteEmployee(scanner);
                break;
            case 4 :
                new ShowManager().showManager();
                break;
        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee System !!");
        Scanner scanner  = new Scanner(System.in);
        while(true) {
           showMenu(scanner);
        }
    }
}
