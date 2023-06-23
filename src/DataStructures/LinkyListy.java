package DataStructures;

public class LinkyListy<T> {

    public Node<T> head;

    public static class Node<T> {
        public Node<T> next;
        public T data;

        public Node(T data) {
            this.data = data;
        }

        public Node() {}
    }

    // Method to insert a new node to LinkyListy
    public void insert(T data) { // Append to tail
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public static <T> int getLength(Node<T> head) {
        if (head == null) {
            throw new NullPointerException("Head is null.");
        }
        Node<T> temp = head;
        int count = 0;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            count++;
        }
        return count;
    }

    public static <T> void printList(Node<T> head) {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}