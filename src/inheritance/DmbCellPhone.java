package inheritance;

public class DmbCellPhone extends CellPhone { //상속받음

  int channel;

  public DmbCellPhone(String model, String color, int channel) {
    this.model = model; //상속받은필드
    this.color = color; //상속받은 필드
    
    
    this.channel = channel;
  }
  void turnOnDmb() {
    System.out.println(channel+"번으로 dmb방송을 시작합니다");
  }
  void changeChannelDmb(int channel) {
    this.channel = channel;
    System.out.println(channel + "번으로 바꿉니다");
  }
  void turnOffDmb() {
    System.out.println("dmb 방송 수신을 멈춥니다");
  }
  
}
