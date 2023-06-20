package bt13;

public class MyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    private int numNode;

    public MyLinkedList() {

    }

//    public MyLinkedList(Node<T> head, Node<T> tail) {
//        this.head = head;
//        this.tail = tail;
//    }

    public void addFirst(T item) {
        Node<T> temp = head;
        head = new Node<>(item);
        head.setNext(temp);
        numNode++;
    }

    public void addLast(T item) {
//        Node<T> temp = tail;
        Node<T> newNode = new Node<>(item);
        Node<T> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);
        newNode.setNext(tail);
        numNode++;
    }

    public void addByIndex(int index, T item) {
        if (index < 0 || index > numNode - 1) {
            System.err.println("Lỗi khi bạn muốn chèn vào vị trí không có");
        }
        Node<T> newNode = new Node<T>(item);
        if (index == 0) {
            Node<T> temp = head;
            head = new Node<>(item);
            head.setNext(temp);
            numNode++;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
            numNode++;
        }
    }

    public void removeFirst() {
        if (head == null) {
            System.err.println("Không có phần tử trong list");
            return;
        }
        head = head.getNext();
        numNode--;
    }

    public void removeLast() {
        if (head == null) {
            System.err.println("Không có phần tử trong list");
            return;
        }
        if (head.getNext() == null) {
            head = null;
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(null);
        }
        numNode--;
    }

    public void removeByIndex(int index) {
        if (index < 0 || index > numNode - 1) {
            System.err.println("Lỗi khi bạn muốn chèn vào vị trí không có");
            return;
        }
        if (head.getNext() == null) {
            head = null;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
        }
        numNode--;
    }

    public Node<T> get(int index) {
        if (index < 0 || index > numNode - 1) {
            System.err.println("Lỗi khi bạn muốn chèn vào vị trí không có");
        } else {
            Node<T> temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.getNext();
            }
            return temp;
        }
        return null;
    }
}
