package type;

public class ArrayCreateByValueListExample2 {

  public static void main(String[] args) {
  
    int sum2 = add(new int[] {10,20,30}); //파라미터를 배열로 받을 때, new 연산자를 통해서 객체를 생성해야 함
    System.out.println(sum2);
  }

  
  
  private static int add(int[] scors) {
    int sum =0;
    for(int i =0; i<3; i++) {
      sum += scors[i];
    }
    return sum;
  }
  
  
}
