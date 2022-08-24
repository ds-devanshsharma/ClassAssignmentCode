package Practice.EmployeeSystem;

public class Employee {
    int empID ;
    String name ;
    String designation;
    String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    int experience;
    Address address;

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "[" +
                "empID=" + empID +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", experience=" + experience +
                ", address=" + address +
                ']';
    }

//    @Override
//    public int hashCode() {
//        return empID;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        Employee employee = (Employee) obj;
//         if(employee.empID==empID)
//             return false;
//         else
//             return true;
//    }
}
