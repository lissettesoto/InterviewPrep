package DataStructures;

import DataStructures.StackUsingArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackUsingArrayTest {

    @Test
    public void testPushAndPeek() {
        StackUsingArray<Integer> stack = new StackUsingArray<>();

        stack.push(5);
        Assertions.assertEquals(5, stack.peek());

        stack.push(10);
        Assertions.assertEquals(10, stack.peek());

        stack.push(12);
        Assertions.assertEquals(12, stack.peek());
    }

    @Test
    public void testPop() {
        StackUsingArray<Integer> stack = new StackUsingArray<>();

        stack.push(5);
        stack.push(10);
        stack.push(12);

        stack.pop();
        Assertions.assertEquals(10, stack.peek());

        stack.pop();
        Assertions.assertEquals(5, stack.peek());

        stack.pop();
        Assertions.assertThrows(IllegalStateException.class, stack::pop);
    }

    @Test
    public void testIsEmpty() {
        StackUsingArray<Integer> stack = new StackUsingArray<>();
        Assertions.assertTrue(stack.isEmpty());

        stack.push(5);
        Assertions.assertFalse(stack.isEmpty());

        stack.pop();
        Assertions.assertTrue(stack.isEmpty());
    }

    @Test
    public void testResize() {
        StackUsingArray<Integer> stack = new StackUsingArray<>();

        stack.push(5);
        stack.push(10);
        stack.push(12);

        Assertions.assertEquals(12, stack.peek());
    }
}
