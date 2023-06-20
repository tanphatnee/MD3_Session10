package bt13;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<String>();
        list.addFirst("Hai");
        list.addFirst("Huy");
        list.addLast("Binh");
        System.out.println(list.get(0).getElement());
        System.out.println(list.get(1).getElement());
        System.out.println(list.get(2).getElement());
        list.removeByIndex(1);
        System.out.println(list.get(0).getElement());
        System.out.println(list.get(1).getElement());
    }
}
