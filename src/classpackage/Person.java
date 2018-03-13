package classpackage;

public class Person {

  //final 은 값을 변경할 수 없을 때
  
  final String nation = "Korea";
  final String ssn;  //final은 값을 변경할 수 없다.
  String name;
  
  public Person(String ssn, String name) {
    this.ssn = ssn;
    this.name = name;
  }
}
