package thread8;

public class ThreadA extends Thread {
  
  private WorkObject workObject;
  
  public ThreadA(WorkObject workObject) { //공유객체를 매개값으로 받아 필드에 저장
    this.workObject = workObject;
    
  }

  public void run() {
    for(int i =0; i<10; i++) {
      workObject.methodA(); //10번 호출
      
    }
  }
}
