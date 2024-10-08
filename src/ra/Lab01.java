package ra;

import java.util.Arrays;

public class Lab01 {
    public static void main(String[] args) {
        int [] numbers = {3,5,7,9,1,2,3};
        int maxNumber = Arrays.stream(numbers).max().orElseThrow();
        System.out.println("Số nguyên lớn nhất trong mảng là : " +maxNumber);
    }
}
