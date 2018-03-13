package type;

public class ArrayCreateByValueListExample1 {

  public static void main(String[] args) {
    int[] scors = {58, 64, 99};
    System.out.println(scors[0]);
    System.out.println(scors[1]);
    System.out.println(scors[2]);
    
    
    //총합 - for문을 돌면서(인덱스)로 훑는다.
    int sum =0;
    for (int i = 0; i < 3; i++) {
      sum += scors[i];
      
    }
    System.out.println(sum);
    
    int average = sum / 3;
    
    System.out.println(average);
    // 평균
  }
}
