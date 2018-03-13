package classpackage;

public class Car2Example {

  public static void main(String[] args) {
    Car2 car = new Car2();
    car.setGas(5);
    
    boolean gasState = car.isLeftGas(); //가스가 있을때 true 반환
    
    if (gasState) { // 처음에 true = 값이 존재하기 때문에
      System.out.println("출발합니다");
      car.run();
    }

    if(car.isLeftGas()) {
      System.out.println("넉넉합니다");
    }else {
      System.out.println("가스주입해 주세요");
    }
  }
}
