package inheritance;

public class Computer extends Calculator{

  @Override
  double areaCircle(double r) {
    System.out.println("computer객체의 areaCircle method실행");
    return Math.PI*r*r;
  }
  

}
