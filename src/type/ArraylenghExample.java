package type;

public class ArraylenghExample {

  public static void main(String[] args) {
    int[] scors = {10, 20, 40};
    
    int sum =0;
    for(int i=0; i< scors.length ; i++) {
      sum += scors[i];
    }
    
    System.out.println(sum);
    
    int avg = sum / scors.length; // 배열의 크기가 명수이기도 하니까
    System.out.println(avg);
  }
}
