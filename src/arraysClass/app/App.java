package arraysClass.app;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int[] numbers = {
                1,2,3,7,8,4,7,5,9,7,0
        };
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 8));
        int[] result= Arrays.copyOf(numbers, 6);
        System.out.println(Arrays.toString(result));

        int[] results = Arrays.copyOfRange(numbers, 6, 9);
        System.out.println(Arrays.toString(results));


    }
}
