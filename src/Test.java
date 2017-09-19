/**
 * Created by lsj on 17-9-6.
 */
public class Test {

    public static void main(String[] args) {

      final Object object=new Object();
      Thread t1=new Thread(new Runnable() {
          @Override
          public void run() {
              synchronized (object){
                  try {
                      object.wait();//Object.wait()在释放CPU同时，释放了对象锁的控制
                  } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                  }
                  System.out.println("1");
              }
          }
      });
      Thread t2=new Thread(new Runnable() {
          @Override
          public void run() {
              synchronized (object){
                  object.notify();//notify()调用后，并不是马上就释放对象锁的，而是在相应的synchronized(){}语句块执行结束，自动释放锁
                  try {
                      Thread.sleep(2000);
                      System.out.println("2");
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  try {
                      Thread.sleep(2000);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  System.out.println("3");
              }
          }
      });

      t1.start();
        try {
            Thread.sleep(2000);//sleep并不会释放锁
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }


}

