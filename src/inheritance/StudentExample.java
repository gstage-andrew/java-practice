package inheritance;

public class StudentExample {

  public static void main(String[] args) {
    Student student = new Student("andrew", "1999", 23);
    System.out.println(student.name);
    System.out.println(student.ssn);
    System.out.println(student.studentNo);
  }
}
