package type;

public class AdvancedForExample {

  public static void main(String[] args) {
    int[] scors = {80, 58, 38, 99, 87 };
    
    //향상된 for문
    int sum = 0;
    for (int scor : scors) {
      sum = scor + sum;
    }
    System.out.println(sum);
    
    double avg = sum / scors.length;
    System.out.println(avg);
  }
}
