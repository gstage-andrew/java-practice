package classpackage;

public class KoreanExample {

  public static void main(String[] args) {
    Korean korean1 = new Korean("앤드류", "1987");
    Korean korean2 = new Korean("미키", "1999");
    
    System.out.println(korean1.nation);
    System.out.println(korean1.name);
    System.out.println(korean1.ssn);
    
    
    System.out.println(korean2.nation);
    System.out.println(korean2.name);
    System.out.println(korean2.ssn);
    
  }
}
