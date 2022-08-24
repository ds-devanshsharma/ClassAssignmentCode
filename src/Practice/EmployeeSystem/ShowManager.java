package Practice.EmployeeSystem;

import static Practice.EmployeeSystem.EmployeeSystemDriver.list;

public class ShowManager {

    public void showManager() {
        boolean flag =false;
        for(Employee item : list ){
            if(item.getDesignation().equals("Manager")){
                System.out.println(item);
                flag = true;
            }
        }
        if(flag == false)
            System.out.println("MANAGER NOT FOUND !!");
        System.out.println("********************************************************************");
    }
}
