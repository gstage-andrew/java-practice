package thread5;

public class TargetThread extends Thread{
  
  public void run() {
    for(long i=0; i<1000000 ; i++) {
      
    }
    try {
      Thread.sleep(1500);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    for(long i=0 ; i<100000 ; i++) {
    }
  
  }

}
