package threadpool1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {

  public static void main(String[] args) {
    
    ExecutorService executorService = Executors.newFixedThreadPool(
        Runtime.getRuntime().availableProcessors()); //현재 프로세스를 가지고와서 threadpool을 구성한다.
    
    System.out.println("작업처리요청");

    //Runnalbe 객체는 리턴타입이 없을때
    Runnable runnable = new Runnable() {
      @Override //abstract method 이기 때문에 반드시 재정의해서 사용하라는뜻
      public void run() {
      
        int sum =0;
        for(int i=0; i<=10 ; i++) {
          sum += i;
        }
//        System.out.println("작업결과: "+sum);
      }
      
    };
    
   Future future = executorService.submit(runnable);
   
   try {
    future.get();
    System.out.println("작업처리 완료");
  } catch (InterruptedException | ExecutionException e) {
    e.printStackTrace();
    System.out.println("예외발생"+e.getMessage());
  }
    
   executorService.shutdown(); 
    
  }
}
