package classpackage;

public class Calculator3Example {

  public static void main(String[] args) {
    double with = 3;
    double height = 5;
    
    Calculator3 cal = new Calculator3();
    double result1 = cal.areaRectangle(with);
    double result2 = cal.areaRectangle(with, height);
    
    
    System.out.println(result1);
    System.out.println(result2);
  }
}
