package thread6;

//다른 스레드에게 실행을 양보한다
public class YieldExample {

  public static void main(String[] args) throws InterruptedException {
    
    ThreadA threadA = new ThreadA();
    ThreadB threadB = new ThreadB();
    
    threadA.start(); // thread 클래스에서 상속받았기 때문에, run메소드가 동작함
    threadB.start();
    
    Thread.sleep(3000);
    
    threadA.work = false; //ThreadB만 실행
    
    Thread.sleep(3000);
    threadA.work = true; // ThreadA, B 모두 실행
    
    Thread.sleep(3000);
    
    threadA.stop = true;
    threadB.stop = true;
    
    
  }
}
