package Practice.EmployeeSystem;

import java.util.List;
import java.util.Scanner;

import static Practice.EmployeeSystem.EmployeeSystemDriver.count;
import static Practice.EmployeeSystem.EmployeeSystemDriver.list;

public class AddEmployee {
        Employee employee;
        Address address;
        int id ;
        static boolean existID(int id){
            for (Employee item : list)
                if(item.empID == id)return true;
            return false;
        }
        static void validateID(int id ,Scanner scanner) throws DuplicateEmployeeDetailsException, InvalidEmployeeIdException {
            if(id <1000 || id > 2000){
                    throw new InvalidEmployeeIdException();
            }
            else if (existID( id)) {
                    throw new DuplicateEmployeeDetailsException();
            }
        }
    public void addData(Scanner scanner) {
            try{
            employee = new Employee();
            address = new Address();

            System.out.println("Enter empID : ");
            id= scanner.nextInt();
            validateID(id , scanner);
            employee.setEmpID(id);
            scanner.nextLine();
            System.out.println("Enter Name  : ");
            employee.setName(scanner.nextLine());
            System.out.println("Enter flat no :");
            address.setFlat(scanner.nextInt());
            System.out.println("Enter pincode : ");
            address.setPinCode(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Enter locality : ");
            address.setLocality(scanner.nextLine());
            employee.setAddress(address);
            System.out.println("Enter your Designation : ");
            employee.setDesignation(scanner.nextLine());
            System.out.println("Enter your Department : ");
            employee.setDepartment(scanner.nextLine());
            System.out.println("Enter your Experience : ");
            employee.setExperience(scanner.nextInt());
            System.out.println("Record "+(count+1) +" Added successfully !!");

            list.add(employee);
            }
            catch(DuplicateEmployeeDetailsException  | InvalidEmployeeIdException e){
                count--;
            }
    }
}
