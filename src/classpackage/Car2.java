package classpackage;

public class Car2 {

  int gas;
  
  public void setGas(int gas) {
    this.gas = gas;
  }
  
  boolean isLeftGas() {
    if(gas==0) {
      System.out.println("가스가 없습니다.");
      return false;
      
    }
    System.out.println("가스가 있습니다.: "+ gas);
    return true;
  }
  
  void run() {
    while(true) {
      if(gas > 0) {
        System.out.println("달리고 있습니다.");
        System.out.println("가스잔량 : "+ gas);
        gas -= 1;
      }else {
        System.out.println("멈춥니다. 가스 잔량: "+gas);
        return; //메소드를 종료
      }
    }
  }
}
