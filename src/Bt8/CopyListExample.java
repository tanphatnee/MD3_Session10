package Bt8;

import java.util.ArrayList;
import java.util.List;

public class CopyListExample {
    public static void main(String[] args) {
        List<Integer> sourceList = new ArrayList<>();
        sourceList.add(1);
        sourceList.add(2);
        sourceList.add(3);
        sourceList.add(4);
        sourceList.add(5);
        List<Integer> destinationList = new ArrayList<>(sourceList);
        System.out.println("Danh sách mới: " + destinationList);
    }
}
