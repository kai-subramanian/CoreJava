package ClassObjectTheory;

import net.datafaker.Faker;

class Employee{
    private String employeeId;
    String firstName;
    String lastName;
    String department;
    Employee(String employeeId, 
        String fisrtName, 
        String lastName, 
        String department){
            this.employeeId = employeeId;
            this.firstName = fisrtName;
            this.lastName = lastName;
            this.department = department;
    }

    public String getEmployeeId(){
        return this.employeeId;
    }
    public String getEmployeeName(){
        return this.firstName+" "+this.lastName;
    }
}

public class Classes {
    public static void main(String[] args) {
        Faker faker = new Faker();
        String empID = "ABCD0123";
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String department = faker.community().character();

        Employee firstEmployee = new Employee(empID, firstName, lastName, department);
        
        System.out.println(firstEmployee.getEmployeeId());
        System.out.println(firstEmployee.getEmployeeName());
    }
}
