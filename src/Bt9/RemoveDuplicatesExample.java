package Bt9;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesExample {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);

        List<Integer> uniqueNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
        }
        System.out.println("Danh sách sau khi loại bỏ các phần tử trùng lặp: " + uniqueNumbers);
    }
}
   