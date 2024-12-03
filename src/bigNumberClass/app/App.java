package bigNumberClass.app;

import java.math.BigDecimal;
import java.math.BigInteger;

public class App {
    public static void main(String[] args) {

        BigInteger a = new BigInteger("7000000000000000000000");
        BigInteger b = new BigInteger("8000000000000000000000");
        BigInteger result = a.add(b);
        System.out.println(result);
        System.out.println("=================================================");

        BigDecimal c = new BigDecimal("50.495395");
        BigDecimal d = new BigDecimal("634.25844984");
        BigDecimal results = c.add(d);
        System.out.println(results);

    }
}
