package thread7;

public class SumThread extends Thread{
  private long sum;
  
  public long getSum() {
    return sum;
  }
  public void setSum(long sum) {
    this.sum = sum;
  }
  public void run() {
    for(int i =0 ; i<=100 ; i++ ) {
      sum +=i; // ~100까지의 숫자의 덧셈
    }
  }

}
