package Bt11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinElementExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        numbers.add(12);
        int min = Collections.min(numbers);
        System.out.println("Phần tử nhỏ nhất: " + min);
    }
}
