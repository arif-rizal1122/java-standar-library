package stringClass.app;

import java.util.Locale;

public class StringApp {
    public static void main(String[] args) {

        String name = "Arif Rizal Buka1122";
        String nameLowercase = name.toLowerCase();
        String nameUppercase = name.toUpperCase();

        System.out.println(name);            // Arif Rizal Buka1122
        System.out.println(nameLowercase);   // arif rizal buka1122
        System.out.println(nameUppercase);   // ARIF RIZAL BUKA1122
        System.out.println(name.length());
        System.out.println(name.startsWith("Arifd"));   // false
        System.out.println(name.endsWith("Buka1122"));  // true

        String[] names = name.split("");
        for (var value : names){
            System.out.print(value); // Arif Rizal Buka1122
        }

        System.out.println(" ".isBlank());   // true
        System.out.println("k ".isEmpty());  // false

        System.out.println(name.charAt(9));

        char[] chars = name.toCharArray();
        for (char c : chars){
            System.out.print(", " + c);
        }

    }
}
