public class EmployeeRepositoryApp {
    public static void main(String[] args) {
        EmployeeRepository pp1=new EmployeeRepository();
        Employee p1=new Employee("Muhammad","Hamza");
        Employee p2=new Employee("Zia","ul Haq");
        Employee p3=new Employee("Asim","Munir");
        Employee p4=new Employee("Qamar","Bajwa");
        Employee p5=new Employee("Altaf","Hussain");
        pp1.addEmployee(p1);
        pp1.addEmployee(p2);
        pp1.addEmployee(p3);
        pp1.addEmployee(p4);
        pp1.addEmployee(p5);
        pp1.removeEmployee(p3);
        pp1.displayEmployees();
    }
}
