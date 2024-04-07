public class Company {
    public static void main(String[] args) {
Employee employees[]=new Employee[5];
        employees[0]=new Employee(99999,"jaca");
        employees[1]=new Employee(9,"zenek");
        employees[2]=new Employee(1,"gienek");
        employees[3]=new Employee(929,"marian");
        employees[4]=new Employee(808,"waldek");

        System.out.println(employees[3].getSalary());
        employees[3].setSalary(145);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getSalary());
        }
    }
}
