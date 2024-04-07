package employees;

public class Worker extends Employee {
    public Worker(double salary, String fullName) {
        super(salary, fullName);
    }
    public String positon="Worker";

    public String getPositon() {
        return positon;
    }

    public void setPositon(String positon) {
        this.positon = positon;
    }

    @Override
    public String toString() {
        return "Worker " + getFullName()+", Salary: "+getSalary()+ ", Position= " + getPositon();
    }
}
