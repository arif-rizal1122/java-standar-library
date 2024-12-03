package regularExpresion.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        String name = "arif rizal aja";

        // Pola untuk mencocokkan kata-kata yang mengandung huruf 'a'
        Pattern pattern = Pattern.compile("\\b[a-zA-Z]*[aA][a-zA-Z]*\\b");

        Matcher matcher = pattern.matcher(name);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
