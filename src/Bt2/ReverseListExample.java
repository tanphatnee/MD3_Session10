package Bt2;

import java.util.ArrayList;
import java.util.List;

public class ReverseListExample {
    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);
        originalList.add(5);
        System.out.println("Danh sách gốc: " + originalList);
        List<Integer> reversedList = new ArrayList<>();
        for (int i = originalList.size() - 1; i >= 0; i--) {
            reversedList.add(originalList.get(i));
        }
        System.out.println("Danh sách đảo ngược: " + reversedList);
    }
}
