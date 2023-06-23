package ChapterTwoLinkedLists;
import static DataStructures.LinkyListy.Node;
import static DataStructures.LinkyListy.printList;

public class RemoveDups {

    /**
     * CTCI 2.1. Remove Dups
     * Write code to remove duplicates from an unsorted linkedlist
     * FOLLOW UP:
     * How would you solve this problem if a temporary buffer wasn't allowed
     */
    public void removeDupes(Node head) {
        Node current = head;

        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
        printList(head);
    }
}
