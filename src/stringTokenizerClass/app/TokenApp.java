package stringTokenizerClass.app;

import java.util.StringTokenizer;

public class TokenApp {
    public static void main(String[] args) {

        String name = "Arif Rizal Baru";
        StringTokenizer tokenizer = new StringTokenizer(name, " "); // delimeter pemotong

        while (tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            System.out.println(token);
        }

    }
}
