package thread10;

public class StopFlagExample {

  public static void main(String[] args) throws InterruptedException {
    PrintThread1 thread1 = new  PrintThread1();
    thread1.start();
    
    Thread.sleep(10);
    
    thread1.setStop(true); //자원을 정리하기 위해서
  }
}
