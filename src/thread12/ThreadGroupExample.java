package thread12;

public class ThreadGroupExample {

  public static void main(String[] args) {
    //thread group
    ThreadGroup myGroup = new ThreadGroup("myGroup");
    
    WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
    WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
    
    //threadA, B - start()
    workThreadA.start();
    workThreadB.start();

    //list 메소드 출력
    System.out.println("[main thread list 메소드 출력 내용]");
    ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
    mainGroup.list();
    System.out.println();
    
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    
    
    //interrupted 메소드 출력
    System.out.println("[interrupted 메소드 호출]");
    myGroup.interrupt();
  }
}
