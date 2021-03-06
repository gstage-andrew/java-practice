package inheritance1;

public class InstanceOfEx {

  public static void method1(Parent parent) {

    if (parent instanceof Child) {
      Child child = (Child) parent; 
      System.out.println("method 1 - child 로 변환 성공");
    }else {
      System.out.println("method1 - child 변환 안됨");
    }
    
  }
  public static void method2(Parent parent) {
    Child child = (Child) parent;
    System.out.println("method2 - child 변환 성공");

  }
  
  public static void main(String[] args) {
    Parent parentA = new Child();
    method1(parentA);
    method2(parentA);
    
    Parent parentB = new Parent();
    
    method1(parentB);
    method2(parentB);
  }
}
