package Week7.Q3;

import java.util.Date;

public class Employee extends Person {
    protected String office;
    protected double salary;
    protected Date dateHired;

    public Employee(String name, String address, String number, String email, String office, double salary) {
        super(name, address, number, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = new Date();
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getOffice() {
        return this.office;
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public String getData() {
        return "Person{name=" + this.name + ", address= " + this.address + ", phoneNumber=" + this.number
                + ", Email=" + this.email + "}" + " Employee{office=" + this.office + ", salary=" + this.salary
                + ", dateHired="
                + this.dateHired + "}";
    }

    @Override
    public String toString() {
        return "Employee\n" + "Name: " + this.name + "\nAddress: " + this.address + "\nPhone: " + this.number
                + "\nEmail: " + this.email + "\n" + "Office: " + this.office + "\nSalary: " + this.salary
                + "\nDate hired: " + this.dateHired + "\n" + getData();
    }

}
