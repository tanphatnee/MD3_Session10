package Bt4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringListExample {
    public static void main(String[] args) {

        String inputString = "Rekkei Academy để nông dân biết code";
        List<String> stringList = new ArrayList<>();
        String[] words = inputString.split(" ");
        Collections.addAll(stringList, words);
        System.out.println("Các chuỗi có độ dài lớn hơn 3 ký tự:");
        for (String str : stringList) {
            if (str.length() > 3) {
                System.out.println(str);
            }
        }
    }
}
