package Week7.Q3;

public class Faculty extends Employee {
    private String officeHour;
    private String rank;

    public Faculty(String name, String address, String number, String email, String office, double salary,
            String officeHour, String rank) {
        super(name, address, number, email, office, salary);
        this.officeHour = officeHour;
        this.rank = rank;
    }

    public void setOfficeHour(String officeHour) {
        this.officeHour = officeHour;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getOfficeHour() {
        return this.officeHour;
    }

    public String getRank() {
        return this.rank;
    }

    @Override
    public String getData() {
        return "Person{name=" + this.name + ", address= " + this.address + ", phoneNumber=" + this.number
                + ", Email=" + this.email + "}" + " Employee{office=" + this.office + ", salary=" + this.salary
                + ", dateHired="
                + this.dateHired + "}" + " Faculty{officeHour=" + this.officeHour + ", rank=" + this.rank + "}";
    }

    @Override
    public String toString() {
        return "Faculty\n" + "Name: " + this.name + "\nAddress: " + this.address + "\nPhone: " + this.number
                + "\nEmail: " + this.email + "\n" + "Office: " + this.office + "\nSalary: " + this.salary
                + "\nDate hired: " + this.dateHired + "\nOffice hour: " + this.officeHour + "\nRank: " + this.rank
                + "\n" + getData();
    }
}
