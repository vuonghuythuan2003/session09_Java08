package ra;

import java.util.Arrays;

public class Lab06 {
    public static void main(String[] args) {
        String [] words = {"Vương", "Huy", "Thuận", "Nguyễn", "Thị", "Hòa"};
        String [] uppersCase = Arrays.stream(words).map(String::toUpperCase).toArray(String[]::new);
        System.out.println("Chuyển chuỗi thành in hoa nha pro: " + Arrays.toString(uppersCase));
    }
}
