package ChapterTwoLinkedLists;
import static DataStructures.LinkyListy.Node;

/**
 * CTCI 2.2. Remove Kth to Last
 * Implement an algorithm to find the kth to last element of a singly linked list.
 */
public class RemoveKthToLast {
    public int returnKthElementFromLast(Node head, int key) {
        int i = 1;
        Node slow = head;
        Node fast = head;

        while (i < key && fast.next != null) {
            fast = fast.next;
            i++;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return (int) slow.data;
    }

}
