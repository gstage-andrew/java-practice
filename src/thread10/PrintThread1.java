package thread10;

public class PrintThread1 extends Thread{

  private boolean stop; //stop 플래그 지정
  
  public void setStop(boolean stop) {
    this.stop = stop;
  }

  @Override
  public void run() {
    super.run();
    while(!stop) {
      System.out.println("실행중");
    }
    System.out.println("자원 정리");
    System.out.println("실행 종료");
  }
  
}
