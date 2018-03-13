package thread9;

public class DataBox {

  private String data;
  
  public synchronized String getData() {
    
    if (this.data == null) {
      try {
        wait();  //data필드가 널이면 소비자 스레드를-> 일시정지 상태로 만듦
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    
    String returnValue = data;
    System.out.println(returnValue);
    
    data = null;  //data필드를 널로 만들고 생산자 스레드를-> 실행대기상태로
    notify();
    return returnValue;
  }
  
  
  public synchronized void setData(String data) {
    if(this.data != null ) {
      try {
        wait();  
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      
    }
    this.data = data;
    System.out.println("thread 생성한 데이터: "+ data);
    notify();
   
  }
}
