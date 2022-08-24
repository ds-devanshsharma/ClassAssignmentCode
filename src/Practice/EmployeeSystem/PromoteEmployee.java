package Practice.EmployeeSystem;

import java.util.Scanner;

import static Practice.EmployeeSystem.EmployeeSystemDriver.list;

public class PromoteEmployee {
    int promoteID;
    public void promoteEmployee(Scanner scanner) {
        System.out.println("Enter empID you want to promote :");
        promoteID = scanner.nextInt();
        boolean status = false ;
        try {
            for (Employee item : list) {
                if (item.getEmpID() == promoteID) {
                    if (item.getExperience() > 5) {
                        item.setDesignation("Manager");
                        System.out.println(item.getEmpID() + " Promoted to MANAGER ! ");
                        status = true;
                    } else {
                        status = true;
                        throw new InvalidExperienceException();
                    }
                }
            }
        }catch(InvalidExperienceException e ){

        }
        if(status == false){
            System.out.println("RECORD NOT FOUND !!");
        }
        System.out.println("*********************************************************************");
    }
}



