package ra;

import java.util.Arrays;

public class Lab04 {
    public static void main(String[] args) {
        String [] words = {"Thuận", "Thanh", " Tùng", "Anh", "Em", "Pro"};
        Arrays.stream(words).sorted().forEach(System.out::println);
    }
}
