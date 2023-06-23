package ChapterTwoLinkedLists;
import static DataStructures.LinkyListy.Node;

public class LoopDetection {

    public Node getCycle (Node head){
        Node slow = head;
        Node fast = head;

        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                break;
            }
        }
        if(fast == null || fast.next == null){
            return null;
        }
        slow = head;
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }

}
