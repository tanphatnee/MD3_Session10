package Bt7;

import java.util.ArrayList;
import java.util.List;

public class RemoveEvenNumbersExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(4);
        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
        numbers.clear();
        numbers.addAll(oddNumbers);
        System.out.println("Danh sách sau khi xóa các số chẵn: " + numbers);
    }
}
