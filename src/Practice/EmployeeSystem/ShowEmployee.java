package Practice.EmployeeSystem;

import java.util.List;
import java.util.Scanner;

public class ShowEmployee {
    public void showData(List<Employee> list ,Scanner scanner){
        System.out.println("EMPLOYEE RECORD !!!");
        if(list.isEmpty()){
            System.out.println("NO RECORD FOUND 404 !!");
            EmployeeSystemDriver.showMenu(scanner);
        }
        else {
            for (Employee item : list)
                System.out.println(item.getEmpID() + " || " + item.getName());
        }
        System.out.println("****************************************************************");
    }
}
