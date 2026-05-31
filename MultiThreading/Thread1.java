package MultiThreading;

public class Thread1 extends Thread {

    @Override
    public void run() {
        System.out.println("Thread Created by Extending Thread class");
    }

    public static void main(String[] args) {
        Thread t = new Thread();
        t.start();
        // t.setName("Extends");

        // syst.activeCount();
        // System.out.println(t.getName());
        System.out.println("Active Threads: " + Thread.activeCount());

    }

}
