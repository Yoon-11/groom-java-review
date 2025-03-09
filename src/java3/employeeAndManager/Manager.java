package java3.employeeAndManager;

public class Manager extends Employee{
    private String position;

    public Manager(String name, int salary, String position) {
        super(name, salary);
        this.position = position;
    }


    @Override
    public void printInformation() {
        System.out.println("자식 name = " + name);
        System.out.println("자식 salary = " + salary);
        System.out.println("자식 position = " + position);
    }
}
