class Employe {

    public double calculateSalary(double Salary) {
        return Salary;
    }
}
class Manage extends Employe {
    @Override
    public double calculateSalary(double Salary) {
        return Salary+10000;
    }
}
class Director extends Manage {
    @Override
    public double calculateSalary(double Salary) {
        return Salary+15000;
    }
}
public class manager {
    public static void main(String[] args) {
        Employe emp = new Employe();
        Manage mgr = new Manage();
        Director dir = new Director();
        System.out.println("Employee Salary: " + emp.calculateSalary(32000));
        System.out.println("Manager Salary: " + mgr.calculateSalary(52000));
        System.out.println("Director Salary: " + dir.calculateSalary(85000));
    }
}