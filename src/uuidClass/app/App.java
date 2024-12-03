package uuidClass.app;

import java.util.UUID;

public class App {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            UUID uuid = UUID.randomUUID();
            String key = uuid.toString();
            System.out.println(key);
        }

    }
}
