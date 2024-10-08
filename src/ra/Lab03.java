package ra;

import java.util.Arrays;

public class Lab03 {
    public static void main(String[] args) {
        int [] numbers = {3, 5, 7, 9, 12, 14, 6};
        int sum = Arrays.stream(numbers).reduce(0, (a,b) -> a + b);
        System.out.println(sum);
    }
}
