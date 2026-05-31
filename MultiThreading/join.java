package MultiThreading;

public class join {
    public static void main(String[] args) {
        Thread t= new Thread(()->{
            for(int  i=1;i<=50;i++){
                System.out.println(i);
            }
        });
        
        t.start();
      try{
        t.join();
      }
      catch(InterruptedException e){
        System.out.println(e.getMessage());
      }
        
          Thread t1= new Thread(()->{
            for(int  i=11;i<=20;i++){
                System.out.println(i);
            }
        });
        
        t1.start();
    }
}
