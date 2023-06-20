package Th1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println("element 4: " + listInteger.get(4));
        System.out.println("element 1: " + listInteger.get(1));
        System.out.println("element 2: " + listInteger.get(2));

        try {
            listInteger.get(6);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("element 6: " + e.getMessage());
        }

        try {
            listInteger.get(-1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("element -1: " + e.getMessage());
        }
    }
}
