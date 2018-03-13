package thread8;

public class WorkObject {

  public synchronized void methodA() {
    System.out.println("ThreadA의 methodA()작업 실행");
    notify();  //일시정지 상태에 있는 threadB를-> 실행대기 상태로
    try {
      wait();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
  }
  
  public synchronized void methodB() {
    System.out.println("ThreadB의 methodB()작업 실행");
    notify();  //일시정지 상태에 있는 threadA를-> 실행대기 상태로
    try {
      wait();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
  }
}
