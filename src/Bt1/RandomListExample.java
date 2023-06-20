package Bt1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomListExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int numElements = (int) (Math.random() * 10) + 1;
        for (int i = 0; i < numElements; i++) {
            int randomNum = (int) (Math.random() * 100);
            numbers.add(randomNum);
        }
        System.out.println("List số nguyên ngẫu nhiên: " + numbers);
        int max = Collections.max(numbers);
        System.out.println("Phần tử lớn nhất: " + max);
    }
}
