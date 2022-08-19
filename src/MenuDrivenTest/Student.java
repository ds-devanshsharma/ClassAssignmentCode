package MenuDrivenTest;

public class Student {
    int id;
    String firstName;
    String lastname ;
    String city;
    String contact;

    public Student(int id, String firstName, String lastname, String city, String contact) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        this.city = city;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", city='" + city + '\'' +
                ", contact='" + contact ;
    }

    public int getId() {
        return id;
    }

    public static String toString(Student[] array, int id ) {
        return  "id=" + id +
                ", firstName='" + array[id].firstName + '\'' +
                ", lastname='" + array[id].lastname + '\'' +
                ", city='" + array[id].city + '\'' +
                ", contact='" + array[id].contact ;
    }
}
