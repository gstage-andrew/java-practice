package thread11;

public class AutoSaveThread extends Thread {

  @Override
  public void run() {
    super.run();
    while(true) {
      try {
        Thread.sleep(1000); //1초 간격으로 실행?
        
      } catch (InterruptedException e) {
        e.printStackTrace();
        break;
      }
      save();
    }
  }

  private void save() {
    System.out.println("작업 내용을 저장합니다");
    
  }
  

}
