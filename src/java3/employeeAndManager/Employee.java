package java3.employeeAndManager;

public class Employee {
    public String name;
    public int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void printInformation() {
        System.out.println("부모 name = " + name);
        System.out.println("부모 salary = " + salary);
    }
}
