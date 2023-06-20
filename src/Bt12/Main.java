package Bt12;

import bt12.MyList;

public class Main {
    public static void main(String[] args) {
        bt12.MyList<Integer> list = new MyList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.print();
    }
}