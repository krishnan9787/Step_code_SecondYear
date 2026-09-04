class Employee {
    String empName;
    double salary;
    boolean permanent;
}

public class Main {
    public static void main(String[] args) {
        // Create one Employee object without setting any fields
        Employee emp = new Employee();

        // Print all three fields right away to reveal their default values
        System.out.println("Name: " + emp.empName);
        System.out.println("Salary: " + emp.salary);
        System.out.println("Permanent: " + emp.permanent);
    }
}