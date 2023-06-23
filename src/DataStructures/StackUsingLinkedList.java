package DataStructures;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackUsingLinkedList<T> {
    private StackNode<T> head;
    private static class StackNode<T>{
        public T data;
        public StackNode<T> next;

        public StackNode(T data){
            this.data = data;
            this.next = null;
        }
    }


    public void push(T item){
        StackNode inserting = new StackNode<>(item);
        if (head != null) {
            inserting.next = head;
        }
        head = inserting;
    }

    public T pop(){
        if(head == null){
            throw new EmptyStackException();
        }
        T item = head.data;
        head = head.next;
        return item;
    }

    public T peek(){
        if(head == null){
            throw new EmptyStackException();
        }
        return head.data;
    }

    public boolean isEmpty (){
        return head == null;
    }
}