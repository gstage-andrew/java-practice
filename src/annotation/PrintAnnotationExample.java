package annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExample {

  public static void main(String[] args) {
    //Service 클래스에 선언된 메소드 얻기 (리플렉션)
    Method[] declaredMethods = Service.class.getDeclaredMethods();
    for (Method method : declaredMethods) {
      if(method.isAnnotationPresent(PrintAnnotation.class)) {
        PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
        System.out.println("["+method.getName()+"]");
        for(int i =0; i<printAnnotation.number(); i++) {
          System.out.print(printAnnotation.value());
        }
        System.out.println();
        
        
        try {
          method.invoke(new Service());
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
    }
  }
}
