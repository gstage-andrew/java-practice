package inheritance;

public class CellPhone {

  String model;
  String color;
  
  void powerOn() {
    System.out.println("power on ");
    }
  void powerOff() {
    System.out.println("power off");
  }
  void bell() {
    System.out.println("ringing bell");
  }
  void sendVoice(String message) {
    System.out.println("send :"+message);
  }
  void hangUp() {
    System.out.println("전화를 끊습니다.");
  }
}
