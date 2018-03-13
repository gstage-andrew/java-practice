package thread5;

public class ThreadStateExample {
  public static void main(String[] args) {
    StatePrintThread printThread = new StatePrintThread(new TargetThread());
    
    
    printThread.start();
  }
}
