package DataStructures;

import java.util.NoSuchElementException;

/**
 * FIFO: Operates under the First In First Out discipline.
 */
public class QueueUsingArray<T> {
    private T[] arr;
    private int size;
    private int head;
    private int tail;

    public QueueUsingArray(int size){
        this.size = size;
        this.head = 0;
        this.tail = -1;
        this.arr = (T[]) new Object[size];
    }

    public void enqueue(T element){
        if (tail + 1 == head || (head == 0 && tail == size - 1)) {
            throw new IllegalStateException("Queue is full");
        }

        if (tail == size - 1) {
            resize();
        }
        tail++;

        arr[tail] = element;
    }

    public T peek(){
        return arr[head];
    }

    public void dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        arr[head] = null;

        if (head == size - 1) {
            head = 0;
        } else {
            head++;
        }
    }

    public boolean isEmpty() {
        if(head == -1 && tail == -1){
            return true;
        } else {
            return false;
        }

    }

    public boolean isFull(){
        return tail == arr.length -1;
    }

    private void resize(){
        T[] resizedArray = (T[]) new Object[size * 2];
        for(int i = 0; i < arr.length; i++){
            arr[i] = resizedArray[i];
        }
        arr = resizedArray;
        size = size * 2;
    }
}

