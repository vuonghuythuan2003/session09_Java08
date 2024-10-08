package ra;

import java.util.Arrays;

public class Lab02 {
    public static void main(String[] args){
        int [] numbers = {1, 2, 46, 3, 8, 10};
        Arrays.stream(numbers).filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
