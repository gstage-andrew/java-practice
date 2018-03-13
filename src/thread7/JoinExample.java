package thread7;

public class JoinExample {

  public static void main(String[] args) {
    SumThread sum = new SumThread();
    sum.start();
    
    try {
      sum.join(); // sum thread가 종료할 때 까지메인 스레드를 일시 정지시킴,, 여기를 주석하면, 결과값이 다르게 나옴
      //sum을 하기전에 이미 출력이 되기 때문에
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    
    System.out.println("1~100합:"+sum.getSum());
  }
}
