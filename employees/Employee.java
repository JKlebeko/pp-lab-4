package employees;

public class Employee {

    private String fullName;
    private double salary;

    public String getFullName() {
        return fullName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " + getFullName() +", Salary: "+ getSalary();
    }

    public Employee(double salary, String fullName) {
        this.salary = salary;
        this.fullName = fullName;
    }
}
