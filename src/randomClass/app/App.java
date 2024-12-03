package randomClass.app;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {              // jumlah yg ingin direndom
            var value = random.nextInt(80);   // maximal angka
            System.out.println(value);
        }
    }
}
