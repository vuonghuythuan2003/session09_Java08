package ra;

import java.util.Arrays;

public class Lab05 {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 6, 7, 12, 3, 44, 23, 32, 13};

        Arrays.stream(numbers).forEach(System.out::println);
    }
}