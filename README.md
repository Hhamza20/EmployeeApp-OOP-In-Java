# EmployeeApp-OOP-In-Java
Object Oriented Programming (OOP) 

Task 1
1) Create a class named "Employee" with the following attributes:
 - firstName: String
 - lastName: String
2) Implement a parameterized constructor in the `Employee` class that accepts `firstName` and `lastName` 
as parameters and initializes the respective data members.
Implement a print function that displays the complete name (firstName lastName) of an Employee
3) Create a class named "EmployeeRepository" with the following attributes:
 - employeesSet: HashSet<Employee>
4) Inside the "EmployeeRepository" class, declare a `HashSet` named "employeesSet" of type `Employee`. 
This set will store employees in the repository.
5) Implement a method named "addEmployee" in the "EmployeeRepository" class that accepts an 
Employee object as a parameter. This method should add the employee to the employeesSet.
6) Implement another method named "removeEmployee" in the "EmployeeRepository" class that accepts 
an Employee object as a parameter. This method should remove the employee from the employeesSet.
7) Implement a method named "displayEmployees" in the "EmployeeRepository" class that iterates over 
the employeesSet and prints out the full names of each employee.
8) Create a class named "EmployeeRepositoryApp" that contains the main method.
Inside the main method:
9) Create an instance of the "EmployeeRepository" class.
10) Create several instances of the "Employee" class using different first names and last names.
11) Use the "addEmployee" method to add the Employee instances to the EmployeeRepository's 
employeesSet.
12) Use the "removeEmployee" method to remove an employee from the EmployeeRepository's 
employeesSet.
13) Call the "displayEmployees" method to print out the full names of all the employees in the repository.
