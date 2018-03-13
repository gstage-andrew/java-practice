package type;

public class StringEqualsExample {

    public static void main(String[] args) {
      
      String var1 = "andrew";
      String var2 = "andrew";
      
      //참조같음,문자열도 같음
      if(var1 == var2 ) {
        System.out.println("참조가 같음");
      }else {
        System.out.println("참조가 다름");
      }
      
      if(var1.equals(var2)) {
        System.out.println("문자열이 같음");
      }else {
        System.out.println("문자열이 다름");
      }

      
      String var3 = new String("앤드류");
      String var4 = new String("앤드류");
      
      //참조가 다름, 문자열은 같음
      if(var3 == var4 ) {
        System.out.println("참조가 같음");
      }else {
        System.out.println("참조가 다름");
      }
      
      if(var3.equals(var4)) {
        System.out.println("문자열이 같음");
      }else {
        System.out.println("문자열이 다름");
      }
      
    }
}
