package type;

public class ArrayCreateByNewExample {

  public static void main(String[] args) {
    
    int[] arry = new int[3]; //3개짜리 배열만듬
    for(int i =0; i<3 ; i++) {
      System.out.println(arry[i]); // 0으로 초기화
    }

    arry[0]=10;
    arry[1]=20;
    arry[2]=30;
    
    for(int i =0; i<3 ; i++) {
      System.out.println(arry[i]); // 값 대입
    }

    double[] doubleArraay = new double[3];
    for (int i = 0; i < doubleArraay.length; i++) {
      System.out.println(doubleArraay[i]);
    }
    String[] strArray = new String[3];
    for (int i = 0; i < strArray.length; i++) {
      System.out.println(strArray[i]);
    }
    strArray[0] = "str1";
    strArray[1] = "str2";
    strArray[2] = "str3";
    
    for (int i = 0; i < strArray.length; i++) {
      
      System.out.println(strArray[i]);
    }
  }
}
