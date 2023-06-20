package Bt5;

import java.util.ArrayList;
import java.util.List;

public class ShortestWordExample {
    public static void main(String[] args) {

        String sentence = "hihihihihiihihihihih ha haa";
        String[] words = sentence.split(" ");
        List<String> shortestWords = new ArrayList<>();
        int minLength = Integer.MAX_VALUE;
        for (String word : words) {
            int length = word.length();
            if (length < minLength) {
                minLength = length;
                shortestWords.clear();
                shortestWords.add(word);
            } else if (length == minLength) {
                shortestWords.add(word);
            }
        }
        System.out.println("Chữ ngắn nhất: " + shortestWords);
    }
}
