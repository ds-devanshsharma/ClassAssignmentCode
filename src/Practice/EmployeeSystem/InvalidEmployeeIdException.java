package Practice.EmployeeSystem;

public class InvalidEmployeeIdException extends Throwable {
    public InvalidEmployeeIdException() {
        System.out.println("ID OUT OF RANGE !! \nPlease enter ID in range 1000-2000 !");
    }
}
