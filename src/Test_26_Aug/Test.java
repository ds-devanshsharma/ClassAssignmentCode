package Test_26_Aug;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    private int empID;
    String name;
    String city;
    int pincode;
    double salary;
    int experience;

    public Employee(int empID, String name, String city, int pincode, double salary, int experience) {
        this.empID = empID;
        this.name = name;
        this.city = city;
        this.pincode = pincode;
        this.salary = salary;
        this.experience = experience;
    }

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }
}
class SortBYName implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }


}
class SortBYSalary implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int)(o1.salary- o2.salary);
    }
}
class SortBYCity implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.city.compareTo(o2.city);
    }
}
class SortBYSalaryANDCity{
    static void printStream(List<Employee> list){
        List<Employee> sortedList=
                list.stream().map(employee -> employee)
                        .filter(employee -> employee.salary>10000 && employee.city.equals("Pune"))
                .collect(Collectors.toList());
        Test.printList(sortedList);
    }
}
class FindNames {
    void names(List<Employee> list) {
        list.stream()
                .map(employee -> employee.name)
                .filter(employee -> employee.length() > 5)
                .forEach(System.out::println);
    }
}

public class Test {
        static List<Employee> list = new ArrayList<>();

        static void printList(List<Employee> list) {
            for (Employee item : list)
                System.out.println(item);
        }

        public static void main(String[] args) {
            list.add(new Employee(110, "Baniya", "Pune", 208019, 35000, 2));
            list.add(new Employee(111, "Negi", "Pune", 208018, 67000, 1));
            list.add(new Employee(101, "Devansh", "Kanpur", 208017, 45000, 0));

            System.out.println("Employee : " + list);
            System.out.println("******************************************");
            System.out.println("SortBYName :");
            Collections.sort(list, new SortBYName());
            printList(list);
            System.out.println("****************************************");
            System.out.println("SortBYCity : ");
            Collections.sort(list, new SortBYName());
            printList(list);
            ;
            System.out.println("****************************************");
            System.out.println("SortBYSalary : ");
            Collections.sort(list, new SortBYName());
            printList(list);
            System.out.println("****************************************");
            System.out.println("SortBYSalary&City :");
            SortBYSalaryANDCity.printStream(list);
            System.out.println("****************************************");
            System.out.println("FindNames : ");
            new FindNames().names(list);

        }
}
