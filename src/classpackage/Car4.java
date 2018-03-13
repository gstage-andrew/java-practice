package classpackage;

public class Car4 {

  private int speed;
  
  private boolean stop; //stop 플래그 설정
 
  public int getSpeed() {
    return speed;
  }
  public void setSpeed(int speed) {
    if (speed <0 ) {
      speed = 0;
      return; //메소드를 종료한다
    }else {
      this.speed = speed; //클래스 변수 speed에 set한다
    }
  }
  
  public boolean isStop() {
    return stop; //default false;
  }
  public void setStop(boolean stop) {
    this.stop = stop;
    this.speed = 0;
    
  }
  
  
  
}
