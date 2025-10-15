import java.util.Scanner;

class Employee {
    int id;
    String name;
    int age;
    double salary;
    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.print("Enter Employee Age: ");
        age = sc.nextInt();
        System.out.print("Enter Employee Salary: ");
        salary = sc.nextDouble();
    }
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Salary: " + salary);
    }
}
public class Employedetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Employee[] employees = new Employee[n];
        for (int i = 0; i < employees.length; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            employees[i] = new Employee();
            employees[i].getDetails();
        }
        System.out.println("\n---------Details of Employes----------");
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            employees[i].displayDetails();
        }
    }
}
