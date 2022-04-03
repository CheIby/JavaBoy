package Week7.Q3;

public class Person {
    protected String name;
    protected String address;
    protected String number;
    protected String email;

    public Person(String name, String address, String number, String email) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getNumber() {
        return this.number;
    }

    public String getEmail() {
        return this.email;
    }

    public String toString() {
        return "Name: " + this.name + "\nAddress: " + this.address + "\nPhone: " + this.number
                + "\nEmail: " + this.email + "\n" + getData();
    }

    public String getData() {
        return "Person{name=" + this.name + ", address= " + this.address + ", phoneNumber=" + this.number
                + ", Email=" + this.email + "}";
    }
}
