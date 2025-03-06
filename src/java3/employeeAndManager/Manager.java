package java3.employeeAndManager;

public class Manager extends Employee{
    public String position;

    public Manager(String name, int salary, String position) {
        super(name, salary);
        this.position = position;
    }

    @Override
    public void printInformation() {
        System.out.println("자식 position = " + position);
    }
}
