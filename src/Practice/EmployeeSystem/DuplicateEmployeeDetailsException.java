package Practice.EmployeeSystem;

public class DuplicateEmployeeDetailsException extends Throwable {
    DuplicateEmployeeDetailsException(){
        System.out.println("You Have Entered Duplicate ID : ID Already Exist !");
    }
}
