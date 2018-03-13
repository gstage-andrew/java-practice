package type;

public class ArrayReferenceObjectExample {

  public static void main(String[] args) {
    String[] strArray = new String[3];
    strArray[0]="java";
    strArray[1]="java";
    strArray[2]= new String("java");
    
    System.out.println(strArray[0] == strArray[1]); //true 같은 객체를 참조하고 있기 때문에
    System.out.println(strArray[0] == strArray[2]); //false
    System.out.println(strArray[0].equals(strArray[2])); //true 단순 문자열을 비교하는 거니까
    
    
    
  }
}
