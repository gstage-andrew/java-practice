package classpackage;

public class Car3 {

  int speed;
  
  public int getSpeed() {
    return speed;
  }
  
  void keyTrunOn() {
    System.out.println("키를 돌립니다");
  }
  void run() {
    for (int i = 10; i <= 50; i+=10 ) {
      speed = i; //speed값이 10,20,30,40,50 까지 for문을 돈다
      System.out.println("달립니다 : "+ speed);
    }
  }
}
