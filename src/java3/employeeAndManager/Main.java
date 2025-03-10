package java3.employeeAndManager;

// 직원 클래스와 관리자 클래스 작성하기

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("홍길동", 1000);
        Manager manager = new Manager("김철수", 2000, "점장");

        employee.printInformation();
        System.out.println();
        manager.printInformation();
    }
}
