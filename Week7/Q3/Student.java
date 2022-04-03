package Week7.Q3;

public class Student extends Person {
    private int status;
    public final static int FRESHMAN = 1;
    public final static int SOPHOMORE = 2;
    public final static int JUNIOR = 3;
    public final static int SENIOR = 4;

    public Student(String name, String address, String number, String email, int status) {
        super(name, address, number, email);
        this.status = status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatus() {
        switch (this.status) {
            case 1:
                return "FRESHMAN";
            case 2:
                return "SOPHOMORE";
            case 3:
                return "JUNIOR";
            case 4:
                return "SENIOR";
            default:
                return "No status";
        }
    }

    @Override
    public String getData() {
        return "Person{name=" + this.name + ", address= " + this.address + ", phoneNumber=" + this.number
                + ", Email=" + this.email + "}" + " Student{status=" + getStatus() + "}";
    }

    @Override
    public String toString() {
        return "Student\n" + "Name: " + this.name + "\nAddress: " + this.address + "\nPhone: " + this.number
                + "\nEmail: " + this.email + "\nStatus: " + getStatus() + "\n" + getData();
    }
}
