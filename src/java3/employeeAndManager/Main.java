package java3.employeeAndManager;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("홍길동", 1000);
        Manager manager = new Manager("김철수", 2000, "점장");

        employee.printInformation();
        manager.printInformation();
    }
}
