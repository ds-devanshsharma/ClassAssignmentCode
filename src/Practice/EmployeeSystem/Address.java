package Practice.EmployeeSystem;

public class Address {
    int flat;
    String locality;
    int pinCode;

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "[" +
                "flat=" + flat +
                ", locality='" + locality + '\'' +
                ", pinCode=" + pinCode +
                ']';
    }
}
