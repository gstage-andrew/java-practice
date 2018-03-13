package thread12;

public class WorkThread extends Thread {

  //스레드그룹과 이름 설정
  public WorkThread(ThreadGroup threadGroup, String threadName) {
    super(threadGroup, threadName);
  }
  //run 메소드 exception 났을 때 처리

  @Override
  public void run() {
    super.run();
    while(true) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println(getName()+"interrupted");
        break;
      }
    }
    System.out.println(getName()+"종료됨");
    
  }

  
}
