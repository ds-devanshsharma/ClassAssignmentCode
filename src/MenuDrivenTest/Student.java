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

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

//    public static String toString(Student[] array, int id ) {
//        return  "id=" + id +
//                ", firstName='" + array[id].firstName + '\'' +
//                ", lastname='" + array[id].lastname + '\'' +
//                ", city='" + array[id].city + '\'' +
//                ", contact='" + array[id].contact ;
//    }
}
