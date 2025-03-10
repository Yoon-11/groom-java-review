package java3.thread;

// 두 개의 스레드를 생성하여 동시에 실행하기

public class ThreadMain {
    public static void main(String[] args) {
        Thread thread1 = new Task1();
        Thread thread2 = new Task2();

        thread1.start();
        thread2.start();
    }

}

class Task1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Task1 실행 중 " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Task2 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Task2 실행 중 " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


