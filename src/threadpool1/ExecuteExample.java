package threadpool1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExample {

  public static void main(String[] args) throws Exception {
    //thread pool 2 
    ExecutorService executorService = Executors.newFixedThreadPool(2);
    
    
    for (int i =0 ; i<10 ; i++) {
      Runnable runnable = new Runnable() {

        @Override
        public void run() {
          ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
          int poolSize = threadPoolExecutor.getPoolSize();
          String threadName = Thread.currentThread().getName();
          System.out.println("thread Pool size : "+poolSize);
          System.out.println("thread Name : "+threadName);
          
          //예외 일부러 발생
          int value = Integer.parseInt("삼");
        }
      };
      
      
//      executorService.execute(runnable); //작업처리 요청
      executorService.submit(runnable);
      
      Thread.sleep(10);
      
    }
    executorService.shutdown(); // 스레드풀 종료
  }
}
