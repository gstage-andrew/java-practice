package classpackage;

public class Car4Example {

  public static void main(String[] args) {
    
    Car4 myCar = new Car4();
    
    //잘못된 값 입력
    myCar.setSpeed(-50);
    System.out.println(myCar.getSpeed());
    //올바른 값 입력
    myCar.setSpeed(70);
    System.out.println(myCar.getSpeed());
    
    //멈추기
    if(!myCar.isStop()) { //
      myCar.setStop(true);
      
    }
    System.out.println(myCar.getSpeed());
  }
}
