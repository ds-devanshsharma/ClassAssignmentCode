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
                System.out.println("You have logged Out from Student System !!!\nTHANKS YOU !!!!");
                System.exit(0);
            case 1 :
                new StudentOperations().addData(scanner,array,count );
                count++ ;
                break;
            case 2 :
                new StudentOperations().updateData(array,scanner);
                break;
            case 3 :
                new StudentOperations().removeData(array,scanner);
                count--;
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
/*
Student System !
Enter how many record you gonna enter !!
3
Enter 1 for InsertData!!
Enter 2 for updateData!!
Enter 3 for removeData!!
Enter 4 for fetchAll !!
Enter 5 for Exit !!
Enter your choice :
1
Enter id :
11089
Enter firstName :
Devansh
Enter lastName :
Sharma
Enter city :
CNB
Enter contact :
727552175
Record 1 Added succesfully !!
----------------------------------------------------------------------------
Enter 1 for InsertData!!
Enter 2 for updateData!!
Enter 3 for removeData!!
Enter 4 for fetchAll !!
Enter 5 for Exit !!
Enter your choice :
1
Enter id :
11056
Enter firstName :
Baniya
Enter lastName :
Gupta
Enter city :
Jhashi
Enter contact :
1234554321
Record 2 Added succesfully !!
----------------------------------------------------------------------------
Enter 1 for InsertData!!
Enter 2 for updateData!!
Enter 3 for removeData!!
Enter 4 for fetchAll !!
Enter 5 for Exit !!
Enter your choice :
4
Records of Students !!
id=11089, firstName='Devansh ', lastname='Sharma ', city='CNB', contact='727552175
id=11056, firstName='Baniya', lastname='Gupta', city='Jhashi', contact='1234554321
-----------------------------------------------------------------------------
Enter 1 for InsertData!!
Enter 2 for updateData!!
Enter 3 for removeData!!
Enter 4 for fetchAll !!
Enter 5 for Exit !!
Enter your choice :
1
Enter id :
11212
Enter firstName :
Manish
Enter lastName :
Yadav
Enter city :
Gurgaon
Enter contact :
7654786313
Record 3 Added succesfully !!
----------------------------------------------------------------------------
Enter 1 for InsertData!!
Enter 2 for updateData!!
Enter 3 for removeData!!
Enter 4 for fetchAll !!
Enter 5 for Exit !!
Enter your choice :
4
Records of Students !!
id=11089, firstName='Devansh ', lastname='Sharma ', city='CNB', contact='727552175
id=11056, firstName='Baniya', lastname='Gupta', city='Jhashi', contact='1234554321
id=11212, firstName='Manish', lastname='Yadav', city='Gurgaon', contact='7654786313
-----------------------------------------------------------------------------
Enter 1 for InsertData!!
Enter 2 for updateData!!
Enter 3 for removeData!!
Enter 4 for fetchAll !!
Enter 5 for Exit !!
Enter your choice :
3
Enter id which you want to delete !!
11056
Data Removed Successfully !!
------------------------------------------------------------------------------
Enter 1 for InsertData!!
Enter 2 for updateData!!
Enter 3 for removeData!!
Enter 4 for fetchAll !!
Enter 5 for Exit !!
Enter your choice :
4
Records of Students !!
id=11089, firstName='Devansh ', lastname='Sharma ', city='CNB', contact='727552175
id=11212, firstName='Manish', lastname='Yadav', city='Gurgaon', contact='7654786313
-----------------------------------------------------------------------------
Enter 1 for InsertData!!
Enter 2 for updateData!!
Enter 3 for removeData!!
Enter 4 for fetchAll !!
Enter 5 for Exit !!
Enter your choice :
2
Enter your ID :
11089
Your last updated Data !!
id=11089, firstName='Devansh ', lastname='Sharma ', city='CNB', contact='727552175
Which field you want to edit !!
Enter 1 for id
Enter 2 firstName
Enter 3 for lastName
Enter 4 for city
Enter 5 for contact
Enter 0 for exit !!
1
Enter ID :
11056
Your ID updated succesfully !!
Your last updated Data !!
id=11056, firstName='Devansh ', lastname='Sharma ', city='CNB', contact='727552175
Which field you want to edit !!
Enter 1 for id
Enter 2 firstName
Enter 3 for lastName
Enter 4 for city
Enter 5 for contact
Enter 0 for exit !!
0
Now you are out from updateMenu !!
Data updated Succesfully
 ----------------------------------------------------------
Enter 1 for InsertData!!
Enter 2 for updateData!!
Enter 3 for removeData!!
Enter 4 for fetchAll !!
Enter 5 for Exit !!
Enter your choice :
4
Records of Students !!
id=11056, firstName='Devansh ', lastname='Sharma ', city='CNB', contact='727552175
id=11212, firstName='Manish', lastname='Yadav', city='Gurgaon', contact='7654786313
-----------------------------------------------------------------------------
Enter 1 for InsertData!!
Enter 2 for updateData!!
Enter 3 for removeData!!
Enter 4 for fetchAll !!
Enter 5 for Exit !!
Enter your choice :
5

 */