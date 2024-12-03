package numberClass.app;

public class App {
    public static void main(String[] args) {

          Integer intValue = 10;

          Long longValue = intValue.longValue();
          Double doubleValue = longValue.doubleValue();
          Short shortValue = intValue.shortValue();

          System.out.println(longValue);
          System.out.println(doubleValue);
          System.out.println(shortValue);
          System.out.println("=======================================================");

          String contoh = "2000";
          Integer contohInt = Integer.valueOf(contoh);
          System.out.println(contohInt);



    }
}
