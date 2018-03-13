package thread5;

public class StatePrintThread extends Thread {
  
  
  private Thread targetThread;
  
  public StatePrintThread(Thread targetThread) {
    this.targetThread = targetThread;
  }

  @Override
  public void run() {
    
    while(true) {

      Thread.State state = targetThread.getState(); //스레드 상태 얻기
      System.out.println("타켓스레드 상태: "+ state);
      if (state == Thread.State.NEW) {
        targetThread.start();
      }
      
      if (state == Thread.State.TERMINATED){ //thread 상태가 terminated 상태이면 종료 break
        break;
        
      }
      
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      
    }
  }
}
