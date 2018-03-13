package type;

public class MainStringArrayArgument {

  public static void main(String[] args) {
    
    if(args.length !=2 ) {
      System.out.println("프로그램 사용법");
      System.out.println("java MainStringArrayArgument num1 num2");
      System.exit(0);
    }
    
    
    String strNum1 = args[0]; //arg 데이터 얻기
    String strNum2 = args[1]; //데이터 얻기
    
    int num1 = Integer.parseInt(strNum1); //문자열 정수를 정수형으로 변환
    int num2 = Integer.parseInt(strNum2);
    int result = num1 + num2; //결과 계산
    System.out.println(result);
  }
}
