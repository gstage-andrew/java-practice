package classpackage;

public class StudentExample {

  public static void main(String[] args) {
    
    //new연산자를 통해 메모리에 할당이 되고
    // s1변수에 참조를 함으로써 메모리 상의 위치를 알 수 있게 된다.
    Student s1 = new Student(); 
    System.out.println("s1변수가 Student 객체를 참조합니다.");
    
    Student s2 = new Student();
    System.out.println("s2변수가 Student 객체를 참조합니다.");
  }
}
