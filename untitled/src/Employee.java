public class Employee {
    private String firstName;
    private String lastName;
    public Employee(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public void print(){
        System.out.println("First Name: "+firstName+"  Last Name: "+lastName);
    }
}
