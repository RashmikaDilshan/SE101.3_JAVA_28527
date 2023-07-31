package Lab2;

public class Main {
     public static void main(String[] args) {
        Employee employee = new Employee("Dilshan", 20, 60000);
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Salary: " + employee.getSalary());
    }
}
