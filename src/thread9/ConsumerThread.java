package thread9;

public class ConsumerThread extends Thread{
  private DataBox dataBox;
  
  public ConsumerThread(DataBox dataBox) {
    this.dataBox = dataBox;
    
  }

  @Override
  public void run() {
    super.run();
    for(int i=1 ; i<3 ; i++) {
      String data = dataBox.getData();
      
    }
  }
  
  

}
