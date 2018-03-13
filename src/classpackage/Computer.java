package classpackage;

public class Computer {

  //호출하는 쪽에서 배열을 생성해서 넣어주어야 함
  int sum1(int[] values) {
    int sum = 0;
    for (int i = 0; i < values.length; i++) {
      sum += values[i];
    }
    return sum;  
  }
  
  
  
  //배열의 리스트 형태를 파라미터로만 넘겨줘도 문제 없다
  int sum2(int ... values) {
    int sum=0;
    for (int i = 0; i < values.length; i++) {
      sum += values[i];
    }
    return sum;
  }
  
}
