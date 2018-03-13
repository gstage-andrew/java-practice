package thread6;

import java.awt.Toolkit;

public class SleepExample {

  public static void main(String[] args) {
    
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    for (int i = 0; i<3 ; i++) {
      
      toolkit.beep();
      System.out.println("beep");
      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } //3초
    }
   
    
  }
}
