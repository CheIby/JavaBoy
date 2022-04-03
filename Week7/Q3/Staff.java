package Week7.Q3;

public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String number, String email, String office, double salary, String title) {
        super(name, address, number, email, office, salary);
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String getData() {
        return "Person{name=" + this.name + ", address= " + this.address + ", phoneNumber=" + this.number
                + ", Email=" + this.email + "}" + " Employee{office=" + this.office + ", salary=" + this.salary
                + ", dateHired="
                + this.dateHired + "}" + " Staff{title=" + this.title + "}";
    }

    @Override
    public String toString() {
        return "Staff\n" + "Name: " + this.name + "\nAddress: " + this.address + "\nPhone: " + this.number
                + "\nEmail: " + this.email + "\n" + "Office: " + this.office + "\nSalary: " + this.salary
                + "\nDate hired: " + this.dateHired + "\n" + "Title: " + this.title + "\n" + getData();
    }
}
