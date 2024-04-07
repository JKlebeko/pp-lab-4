import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {

    public static void main(String[] args) {

        Employee employees[]=new Employee[7];
        employees[0]=new Manager(99999,"jaca");
        employees[1]=new Worker(9,"zenek");
        employees[2]=new Employee(1,"gienek");
        employees[3]=new Employee(929,"marian");
        employees[4]=new Worker(808,"waldek");
        employees[5]=new Manager(99999,"jaca2");
        employees[6]=new Worker(9,"zenek2");

//new Manager(employees[0]).setNumberOfSubordinates(0);
        int j=0;
        for (int i = 0; i < employees.length; i++) {
            if (!(employees[i] instanceof Manager)) {
                j++;
                employees[i].setSalary((employees[i]).getSalary()+500);
            }
            else employees[i].setSalary(7500);
            new Manager(employees[i]).setNumberOfSubordinates(j);
        }
        //System.out.println(j);
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] instanceof Manager)
            new Manager(employees[i]).setNumberOfSubordinates(j);
        }



        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }



        

    }
}
