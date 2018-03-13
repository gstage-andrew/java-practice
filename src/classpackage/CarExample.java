package classpackage;

public class CarExample {

  public static void main(String[] args) {
    Car car1 = new Car();
   
    System.out.println(car1.company);
    
    Car car2 = new Car("new modle");
    System.out.println(car2.model);
    System.out.println(car2.company);
  }
}
