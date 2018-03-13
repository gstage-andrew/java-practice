package classpackage;

public class Car3Example {

  public static void main(String[] args) {
    
    Car3 myCar = new Car3();
    myCar.keyTrunOn();
    myCar.run();
    int speed = myCar.getSpeed();
    System.out.println("현재 스피드 : "+speed);
  }
}
