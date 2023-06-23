/**
 * A Stack uses LIFO (Last In First Out) ordering.
 * A stack is a  collection of elements. They are inserted and deleted following the LIFO discipline.
 * That is, as in a stack of plates, the most recent item added to the stack is the first item to be removed.
 * Unlike an array a stack does not offer constant time access to the ith item. However, it does allow constant time
 * adds and removes, as it doesn't require shifting elements around.
 * A stack can be implemented by a LinkedList if the items are added and removed from the same side.
 *
 * Some recursion algo's -> Iteration will require a stack
 *
 *
 *
 *
 * In this class I will provide my implementation of the following stack operations:
 * -> pop(): Remove the item from the top of the stack.
 * -> push(item): Add an item to the top of the stack.
 * -> peek(): Return the top of the stack.
 * -> isEmpty(): Return true if the stack is empty.
 *
 * In order to implement a Stack using an Array, we need the following:
 * -> A fixed size array (Integer)
 * -> Size (Integer)
 * -> A reference (pointer) to the top of the stack (Integer)
 *
 * push(10): 10
 *         ^
 *         top
 *
 * push(15): 10 15
 *              ^
 *             top
 *
 * push(7): 10 15 7
 *                ^
 *               top
 *
 * pop(): 10 15
 *           ^
 *          top
 */

package DataStructures;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class StackUsingArray<T> {
    //Array as the underlying data structure
    private T[] data;
    private int size;
    private int top;


    public StackUsingArray() {
        top = -1;
        size = 16;
        data = (T[]) new Object[size];
    }


    public void push(T element) {
        if (top == size - 1) {
            resize();
        } else {
            top++;
        }
        data[top] = element;
    }


    public void pop(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is empty");
        } else{
            //First get the element that is in the array at the 'top' position so, data[top]
            T element = data[top];
            //Now set that value to null
            element = null;
            //Now change the reference to the element right before it
            top--;
        }
        printStack();
    }

    public T peek(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        return data[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void printStack() {
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }
    private void resize() {
        T[] newData = (T[]) new Object[size * 2];
        for (int i = 0; i <= top; i++) {
            newData[i] = data[i];
        }

        data = newData;
        size *= 2;
    }
}
