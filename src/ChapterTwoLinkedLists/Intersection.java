package ChapterTwoLinkedLists;
import static DataStructures.LinkyListy.Node;

class Result {
    public Node tail;
    public int size;

    public Result (Node tail, int size){
        this.tail = tail;
        this.size = size;
    }
}

public class Intersection {
    public Node findIntersection(Node list1, Node list2){
        if(list1 == null || list2 == null){
            return null;
        }
        Result result1 = getTailAndSize(list1);
        Result result2 = getTailAndSize(list2);

        //If different tail nodes then there is no intersection
        if(result1.tail != result1.tail){
            return null;
        }

        Node shorter = result1.size < result2.size ? list1 : list2;
        Node longer = result1.size < result2.size ? list2 : list1;

        longer = getKthNode(longer, Math.abs(result1.size - result2.size));

        while(shorter != longer){
            shorter = shorter.next;
            longer = longer.next;
        }
        return longer;
    }

    public Result getTailAndSize(Node list){
        if(list == null){
            return null;
        }

        int size = 1;
        Node current = list;
        while(current.next != null){
            size++;
            current = current.next;
        }
        return new Result(current, size);
    }

    Node getKthNode(Node head, int k){
        Node current = head;
        while(k > 0 && current != null){
            current = current.next;
            k--;
        }
        return current;
    }
}
