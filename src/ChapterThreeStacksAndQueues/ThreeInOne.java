package ChapterThreeStacksAndQueues;

import DataStructures.StackUsingArray;

/**
 *
 * Describe how you could use a single array to implement three Stacks.
 *
 * My initial thoughts:
 *  -> One thing we could do is create an array and then divide it into three sub arrays
 *     So we would have a reference to the 0th index, the n/3 index and the 2n/3 index
 *     Let's assume we have an array where n = 9. We would have a reference to 0, 3, and 6.
 *     Those indices would be the top of the 3 Stacks.
 *
 *     head stack1       head stack2      head stack3
 *       ↓                  ↓                 ↓
 *     [  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  ]
 */

import java.util.Stack;

public class ThreeInOne<T> {

    public void threeInOne(int size){

    }



}
