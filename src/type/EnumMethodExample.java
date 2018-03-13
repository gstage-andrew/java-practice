package type;

public class EnumMethodExample {

  public static void main(String[] args) {
    // name 메소드
    Week today = Week.SUNDAY;
    String name = today.name();
    System.out.println(name);
    
    
    // ordinal 메소드
    int ordinal = today.ordinal();
    System.out.println(ordinal);
    
    
    // compareTo 메소드
    Week day1 = Week.MONDAY;
    Week day2 = Week.FRIDAY;
    
    int result1 = day1.compareTo(day2);
    int result2 = day2.compareTo(day1);
    
    System.out.println(result1);
    System.out.println(result2);
    
    // valueOf 메소드
    
    
    // values 메소드 -> 배열로 반환
    Week[] days = Week.values();
    for(Week day : days) {
      System.out.println(day);
    }
  }
}
