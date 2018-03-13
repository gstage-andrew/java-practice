package classpackage;

public class Calculator2 {

  int plus(int x , int y) {
    int result = x + y;
    return result;
  }
  
  double avg(int x , int y) {
    double sum = plus(x,y) ; //pluse 메소드 호출
    double avg = sum /2;
    return avg;
  }
  
  void execute() {
    double result = avg(7, 10);
    println("실행결과"+ result);
  }
  
  void println(String message) {
    System.out.println(message);
  }
  
}
