import java.util.*;
public class EmployeeRepository {
    HashSet<Employee> employeesSet=new HashSet<>();
    public void addEmployee(Employee obj){
        employeesSet.add(obj);
    }
    public void removeEmployee(Employee obj){
        employeesSet.remove(obj);
    }
    public void displayEmployees(){
//        Iterator<Employee> iterator= employeesSet.iterator();
//        while (iterator.hasNext()){
//            iterator.next().print();
//        }
        for (Employee tt1: employeesSet){
            tt1.print();
        }
    }
}
