package employees;

public class Manager extends Employee{
    public Manager(double salary, String fullName) {
        super(salary, fullName);
    }

    public int numberOfSubordinates;

    public Manager(Employee employee) {
        super(employee.getSalary(), employee.getFullName());
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public String toString() {
        return "Manager: " +getFullName()+ ", Salary:"
        +getSalary()+", Subordinates: "+getNumberOfSubordinates();
    }

}
