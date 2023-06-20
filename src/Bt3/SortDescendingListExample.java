package Bt3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortDescendingListExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử: ");
        int numElements = scanner.nextInt();
        for (int i = 0; i < numElements; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            int num = scanner.nextInt();
            numbers.add(num);
        }
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Danh sách sau khi sắp xếp giảm dần: " + numbers);
    }
}
