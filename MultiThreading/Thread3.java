package MultiThreading;

public class Thread3 extends Thread {
    public static void main(String[] args) {
        Thread t= new Thread(){
            @Override
            public void run(){
                System.out.println("Thread Created via anonomus class "+Thread.currentThread());
            }
        };

        // Thread t= new Thread();
        t.start();
        t.setName("Anonomyu class");
        System.out.println(t.getName());
        System.out.println(Thread.activeCount());
    }
}
