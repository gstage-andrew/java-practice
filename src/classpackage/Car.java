package classpackage;

public class Car {

  //field
  String company = "기아 자동차";
  String model;
  String color;
  int maxSpeed;
  int speed;
  
  public Car() {
  }
  
  public Car(String model) {
    this(model, "은색", 250);
  }

  public Car(String model, String color) {
    this(model, color, 250);
  }

  public Car(String model, String color, int maxSpeed) {
    this.model = model;
    this.color = color;
    this.maxSpeed = maxSpeed;
  }
  
  
  
}
