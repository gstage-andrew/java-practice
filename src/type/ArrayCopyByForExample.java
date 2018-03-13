package type;

public class ArrayCopyByForExample {

  public static void main(String[] args) {
    int[] oldArray = {1,2,3};
    int[] newArray = new int[5]; 
    
    
    for (int i =0 ; i<oldArray.length ; i++) {
      newArray[i] = oldArray[i];
      System.out.println(newArray[i]); //3개의 배열만을 복사하기 때문에 그 다음 인덱스를 찾을 수가 없다
    }
    
    
    for (int i=0 ; i<newArray.length; i++) {
      System.out.println(newArray[i]);
    }
  }
}
