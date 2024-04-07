import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {

    public static void main(String[] args) {

        Employee employees[]=new Employee[5];
        employees[0]=new Manager(99999,"jaca");
        employees[1]=new Worker(9,"zenek");
        employees[2]=new Employee(1,"gienek");
        employees[3]=new Employee(929,"marian");
        employees[4]=new Worker(808,"waldek");
//new Manager(employees[0]).setNumberOfSubordinates(0);
        int j=0;
        for (int i = 0; i < employees.length; i++) {
            if (!(employees[i] instanceof Manager)) j++;
        }
        System.out.println(j);

        employees[0].setSalary(7500);
        new Manager(employees[0]).setNumberOfSubordinates(j);

        employees[3].setSalary(145);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }

    }
}
