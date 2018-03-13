package thread11;

import java.util.Map;
import java.util.Set;

public class DeamonExample {
  public static void main(String[] args) throws InterruptedException {
   AutoSaveThread autoSaveThread = new AutoSaveThread();
   autoSaveThread.setName("autoSaveThread");
   autoSaveThread.setDaemon(true);
   autoSaveThread.start();
   
   
   Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
   Set<Thread> threads = map.keySet();
   for(Thread thread : threads) {
     System.out.println("Name: "+ thread.getName() + 
         (thread.isDaemon()? "(데몬)": "(주)" ));
     // \t : tab 이다.
     System.out.println("소속그룹: "+ thread.getThreadGroup().getName());
     System.out.println();
   }
  }
}
