package Bt10;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class SumElementsExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        AtomicInteger sum = new AtomicInteger();


        numbers.forEach(sum::addAndGet);


        System.out.println("Tổng các phần tử: " + sum);
    }
}
