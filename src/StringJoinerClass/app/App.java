package StringJoinerClass.app;

import java.util.StringJoiner;

public class App {
    public static void main(String[] args) {

        String[] names = {"arif", "rizal", "buka"};
        StringJoiner joiner = new StringJoiner(
          "||", "{", "}"
        );
        // delimiter = pemisah nya apa
        // prefix = depan nya
        // suffix = belakang nya

        for (var name : names){
            joiner.add(name);
        }
        System.out.println(joiner.toString());
    }
}
