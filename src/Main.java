import DataStructures.QueueUsingArray;
import DataStructures.StackUsingArray;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        int [] nams = {2,7,11,13};
//        int target = 9;
//
//        int [] sometin = twoSum(nams, target);
//        System.out.println(sometin);
//        String testingWithAllUniqueCharactersInString = "jbaq";
//        String testingWithNonUniqueCharactersInString = "jbbaq";
//
//        boolean testOne = isUnique(testingWithAllUniqueCharactersInString);
//        boolean testTwo = isUnique(testingWithNonUniqueCharactersInString);
//
//        //Output = true
//        System.out.println(testOne);
//        //Output = false
//        System.out.println(testTwo);
//
//        String a = "231";
//        String b = "123";
//
        //Output = true
//        boolean testingPermutation = checkPermutation(a, b);
        //Output = false
//        boolean testingNotPermutation = checkPermutation("bothersome", "kloitrghnv");
//
//        System.out.println(testingPermutation);
//        System.out.println(testingNotPermutation);
////
//        String somethingZero = uRLIfy("Mrr.Jo nes");
//        String somethingOne = uRLIfy("what the  toe");
//        System.out.println(somethingZero);
//        System.out.println(somethingOne);
//
//        String palindromeTrue = "abba";
//        String palindromeFalse = "146fss";
//        String palindromeTruth = "12321";
//
//        boolean isPal = isPalindrome(palindromeTrue);
//        boolean isPalDos = isPalindrome(palindromeFalse);
//        System.out.println(isPal);
//        System.out.println(isPalDos);
//
//        String strOne = "abba";
//        String strTwo = "baba";
//        boolean CTCIOnePointFour = palindromePermutation(strOne, strTwo);
//        System.out.println(CTCIOnePointFour);

//        boolean oa = oneAway("joe", "oe");
//        System.out.println(oa);

//        int [] arr = {0,-3,-2,7,4,5};
//
//        boolean notSure = threeSum(arr, 0);
//        System.out.println(notSure);

//        String compStr = compressedString("aabcccccaa");
//        System.out.println(compStr);
//        int[] arr = new int[]{11, 10, 7, 8};
//        int answer = missingNumber(arr);
//        System.out.println(answer);

//        int [] nums = new int [] {3,2,4};
//
//        int [] rock = twoSum(nums, 6);
//
//        System.out.println(rock);
//
//        int[] pricess = new int[] {7,1,5,3,6,4};

//        int soln = maxProfit (pricess);

//        System.out.println(soln);

//        int [] idk = new int [] {1,2,3,4};
//
//        int[] sum = productExceptSelf(idk);
//        System.out.println(sum);
//
//        int G[][] = {{0,0,0,0,0,0,0},
//                    {0,0,1,1,0,0,0},
//                    {0,1,0,0,1,0,0},
//                    {0,1,0,0,1,0,0},
//                    {0,0,1,1,0,1,1},
//                    {0,0,0,0,1,0,0},
//                    {0,0,0,0,1,0,0}};
//
//
//
//        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
//
//        // Sort by ascending starting point
//
//        int[][] soln = merge(intervals);
//        System.out.println(soln);

        //int[] test = {1,3,6,9,11,14,17,20,33,77,89,1052};
//        int[] test2 = {2, 4, 6, 8, 10, 15, 45, 69, 159, 333, 1052};
//        int[] test3 = new int[3];

//        System.out.println(binSearch(test, 11));
//        System.out.println(binSearch(test, 768445));
//        System.out.println(binSearch(test2, 69));
//        System.out.println(binSearch(test2, 1));
//        System.out.println(binSearch(test3, 1));

        //binSearch(test, 11);
        //binSearch(test, 768445);
//        System.out.println(binSearch(test2, 69));
//        System.out.println(binSearch(test2, 1));
//        System.out.println(binSearch(test3, 1));

//        String test = new String("eat");
//        String testt = new String("tea");
//
//        System.out.println(test.hashCode());
//        System.out.println(testt.hashCode());
//
        List<Integer> tester = new ArrayList<>();
        tester.add(1);
        tester.add(2);
        tester.add(-1);
        tester.add(3);
        tester.add(4);
        Stack<Integer> myStack = new Stack<>();

//        System.out.println("tester: " + Math.abs(tester.get(2)));
//        System.out.println(plusMinus(tester));

        List<Integer> failingTest = new ArrayList<Integer>();
        failingTest.add(256741038);
        failingTest.add(623958417);
        failingTest.add(467905213);
        failingTest.add(714532089);
        failingTest.add(938071625);

        System.out.println(miniMaxSum(failingTest));

        System.out.println(oneEditAway("pale", "ple"));
        System.out.println(oneEditAway("pale", "paless"));
        System.out.println(oneEditAway("pale", "plw"));

        System.out.println(compdString("aabcccccaaa"));

        int[][] matrix = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        setZeroes(matrix);

        System.out.println("\nZero Matrix:");
        printMatrix(matrix);

        System.out.println(isRotatedSubstring("erbottlewat", "waterbottle"));


//        LinkyListy list = new LinkyListy();
//        list.insert(1);
//        list.insert(2);
//        list.insert(5);
//        list.insert(1);
//        list.insert(25);
//        list.insert(5);
//
//        RemoveDups prob21 = new RemoveDups();
//        System.out.println("remove dups");
//        prob21.removeDupes(list.head);
//        list.printList(list.head);
//        //list.deleteNodeByKey(2);
//        //list.removeDupes();
//        //list.returnKthElementFromLast(3);
//
//        RemoveKthToLast prob22 = new RemoveKthToLast();
//
//        System.out.println("\n" + "Result: " + prob22.returnKthElementFromLast(list.head, 1));
//
//        list.deleteNode(list.head.next);
//
//
//        //System.out.println("Head: "+secondList.head.data);
//
//        LinkyListy secondList = new LinkyListy();
//        // Create the example linked list using your LinkedList class
//        secondList.insert(3);
//        secondList.insert(5);
//        secondList.insert(8);
//        secondList.insert(5);
//        secondList.insert(10);
//        secondList.insert(2);
//        secondList.insert(1);
//
//        int partition = 5;
//
//        System.out.println("Before partition: ");
//        LinkyListy.printList(secondList.head);
//
//        System.out.println("After partition: ");
//        LinkyListy.Node partitionedHead = LinkyListy.partition(secondList.head, 5);
//        //secondList.printList(secondList.head);
//
//        LinkyListy list3 = new LinkyListy();
//        LinkyListy list4 = new LinkyListy();
//
//        list3.insert(9);
//        list3.insert(7);
//        list3.insert(8);
//
//        list4.insert(6);
//        list4.insert(8);
//        list4.insert(6);
//
//        LinkyListy.Node test = LinkyListy.sumLists(list3.head, list4.head);
//
//        System.out.println("Length: " + LinkyListy.length(list3.head));
//
//        LinkyListy list5 = new LinkyListy();
//
//        //System.out.println("Length: "+ DataStructures.LinkyListy.length(list5.head));
//
//        LinkyListy.reversedList(list4.head);
//
//        //System.out.println(DataStructures.LinkyListy.isPalindrome(list3.head));
//
//        System.out.println(LinkyListy.getTail(list4.head));
//
//
//    }
        StackUsingArray<Integer> stackUsingArray = new StackUsingArray<>();
        stackUsingArray.push(5);
        stackUsingArray.push(10);

        stackUsingArray.printStack();

        QueueUsingArray<Integer> queue = new QueueUsingArray(10);


    }


    /**
     * CTCI 1.9. String Rotation:
     * Asssume you have a method isSubstring which checks if one word is a substring of another. Given two strings, s1 and s2, write code to check if
     * s2 is a rotation of s1 using only one call to isSubstring (e.g "waterbottle" is a rotation of "erbottlewat")
     */
    public static boolean isRotatedSubstring(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        StringBuilder str1 = new StringBuilder(s1);
        StringBuilder str2 = new StringBuilder(s2);

        StringBuilder combinedString = str1.append(str2);
        String x = combinedString.toString();

        return x.contains(s1);

    }


    /**
     * CTCI 1.8. Zero Matrix
     * Write an algorithm such that if an element in an M x N matrix is 0, its entire row and column are set to 0,
     */


    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        boolean[] rowZeroes = new boolean[rows];
        boolean[] columnZeroes = new boolean[columns];

        // Identify the rows and columns that need to be zeroed
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 0) {
                    rowZeroes[i] = true;
                    columnZeroes[j] = true;
                }
            }
        }

        // Set the corresponding rows to zero
        for (int i = 0; i < rows; i++) {
            if (rowZeroes[i]) {
                Arrays.fill(matrix[i], 0);
            }
        }

        // Set the corresponding columns to zero
        for (int j = 0; j < columns; j++) {
            if (columnZeroes[j]) {
                for (int i = 0; i < rows; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }


    /**
     * CTCI 1.7. Rotate Matrix
     * Given an image represented by an N x N matrix, where each pixel in the image is represented by an integer,
     * write a method to rotate the image by 90 degrees. Can you do this in place?
     */
    public static boolean forCondition(int index, int last) {
        return index < last;
    }

    public static boolean rotate(int[][] matrix) {

        if (matrix.length == 0 || matrix.length != matrix[0].length) {
            return false;
        }

        int n = matrix.length;
        int i = 0;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (i = first; forCondition(i, last); i++) {
                int offset = i - first;
                int top = matrix[first][i]; //save top

                //left -> top
                matrix[first][i] = matrix[last - offset][first];

                //bottom -> left
                matrix[last - offset][first] = matrix[last][last - offset];

                //right -> bottom
                matrix[last][last - offset] = matrix[i][last];

                //top -> right
                matrix[i][last] = top; //right <- saved top
            }
        }
        return true;
    }

    /**
     * CTCI 1.6. String Compression:
     * Implement a method to perform basic string compression using the counts of repeated characters.
     * For example, the string "aabcccccaaa" would become "a2b1c5a3".
     * If the compressed string would not become smaller than the original string,
     * your method should return the original string. You can assume the string has only uppercase
     * and lowercase letters (a-z).
     */
    public static String compdString(String originalString) {

        int ogStrLen = originalString.length();
        StringBuilder compressedString = new StringBuilder();
        int count = 0;
        for (int i = 0; i < ogStrLen; i++) {
            count++;
            if (i + 1 >= ogStrLen || originalString.charAt(i) != originalString.charAt(i + 1)) {
                compressedString.append(originalString.charAt(i));
                compressedString.append(count);
                count = 0;
            }
        }
        if (compressedString.toString().length() < ogStrLen) {
            return compressedString.toString();
        } else {
            return originalString;
        }
    }

    /**
     * CTCI 1.5 One Away:
     * <p>
     * There are three types of edits that can be preformed on strings: insert a character, remove a character, or replace a character.
     * Given two strings, write a function to check if they are one edit (or zero edits) away.
     * <p>
     * EXAMPLE:
     * pale, ple -> true
     * pales, pale -> true
     * pale, bale -> true
     * pale, bake -> false
     */

    public static boolean oneEditAway(String first, String second) {
        if (first.length() == second.length()) {
            return oneEditReplace(first, second);
        } else if (first.length() + 1 == second.length()) {
            return oneEditInsert(first, second);
        } else if (first.length() - 1 == second.length()) {
            return oneEditInsert(second, first);
        }
        return false;
    }

    public static boolean oneEditReplace(String s1, String s2) {
        boolean foundDifference = false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }

    public static boolean oneEditInsert(String s1, String s2) {
        int index1 = 0;
        int index2 = 0;

        while (index2 < s2.length() && index1 < s1.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }


    public static int miniMaxSum(List<Integer> arr) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i));
            min = Math.min(min, arr.get(i));
        }

        int sumMax = 0;
        int totalSum = 0;
        int sumMin = 0;
        //return max sum
        for (int i = 0; i < arr.size(); i++) {
            totalSum += arr.get(i);
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);

        sumMax = totalSum - min;
        sumMin = totalSum - max;

        System.out.print(sumMin + " " + sumMax);
        return 0;
    }
}






//    public static HashMap plusMinus(List<Integer> arr) {
//        // Write your code here
//
//        int n = arr.size();
//
//        HashMap<Integer, Integer> counter = new HashMap<>();
//
//
//        for (int i = 0; i < n; i++) {
//
//            if (counter.containsKey(Math.abs(arr.get(i)))) {
//                counter.put(Math.abs(arr.get(i)), (counter.get(i)) + 1);
//            } else {
//                counter.put(Math.abs(arr.get(i)), 1);
//            }
//
//            //Iterate through the Hashmap values and divide by n, where n is the length
//            //of the array
//
//            for (int j = 0; j < counter.keySet().size(); j++) {
//                //If I have the keyset, I will have to do a lookup everytime.
//                //Best to iterate the values
//
//            }
//
//        }
//
//
//        System.out.print(counter);
//    }





//    public static int binSearch(int [] arr, int target){
//        if(arr.length == 0 || arr == null){
//            return -1;
//        }
//        int left = 0;
//        int right = arr.length - 1;
//        //int mid = (left + (right-left))/2;
//        int soln = 0;
//
//        while (left<=right){
//            int mid = (left + (right-left))/2;
//            if(arr[mid] == target){
//                soln = mid;
//                return soln;
//            } else if (arr[mid]> target) {
//                left = mid + 1;
//            }else {
//                right = mid - 1;
//            }
//        }
//        return -1;
//    }
//
//    public static int[][] merge(int[][] intervals) {
//        if (intervals.length <= 1)
//            return intervals;
//
//        // Sort by ascending starting point
//        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
//
//        List<int[]> result = new ArrayList<>();
//        int[] newInterval = intervals[0];
//        result.add(newInterval);
//        for (int[] interval : intervals) {
//            if (interval[0] <= newInterval[1]) // Overlapping intervals, move the end if needed
//                newInterval[1] = Math.max(newInterval[1], interval[1]);
//            else {                             // Disjoint intervals, add the new interval to the list
//                newInterval = interval;
//                result.add(newInterval);
//            }
//        }
//
//        return result.toArray(new int[result.size()][]);
//    }

//    public static void bfs (int start, int matrix[][], int n){
//        int i = start;
//        Queue<Integer> q1 = new LinkedList<Integer>();
//        int [] visited = new int [7];
//
//        System.out.println(i);
//        visited[i] = 1;
//        q1.add(i);
//
//        while(!q1.isEmpty()) {
//            i = q1.remove();
//            for (int j = 1; j < n; j++) {
//                if (matrix[i][j] == 1 && visited[j] == 0) {
//                    System.out.println(j);
//                    visited[j] = 1;
//                    q1.add(j);
//                }
//            }
//        }
//    }
//
//    public static void dfs(int start, int matrix[][], int n){
//        int [] visited = new int [7];
//        if(visited[start]==0){
//            System.out.println(start);
//            visited[start]=1;
//            for(int j = 1; j<n-1; j++) {
//                if (matrix[start][j] == 1 && visited[j] == 0) {
//                    dfs(j, matrix, n);
//                }
//            }
//        }
//
//        }



//    public String solution(String riddle) {
//        char [] charRepOfRiddle = riddle.toCharArray();
//        for (int i = 0; i < riddle.length(); i++){
//            if (riddle.charAt(i) == '?'){
//                for(int j = 'a'; j <='z'; j++){
//
//                }
//            }
//        }
//
//    }

//    public static int [] twoSum (int [] numbers, int target){
//            int[] result = new int[2];
//            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//            for (int i = 0; i < numbers.length; i++) {
//                if (map.containsKey(target - numbers[i])) {
//                    result[1] = i;
//                    result[0] = map.get(target - numbers[i]);
//                    return result;
//                }
//
//                //the code lines below avoids the "duplicate keys" problem
//                if(map.containsKey(numbers[i])) {
//                    continue;
//                }
//
//                map.put(numbers[i], i);
//            }
//            return result;
//    }

//    public static int maxProfit(int[] prices) {
//
//        //find the minimum and maximum elements in the array
//        int min = minElementInArray(prices); //return 1
//
//        if (min == prices.length-1){
//            return 0;
//        }
//
//        for (; min<prices.length; min++){
//            int difference = prices[min] -
//        }
//    }

//    public static int minElementInArray(int[] prices){
//        int index = 0;
//        int min = prices[index];
//        for (int i = 1; i < prices.length; i++){
//            if (prices[i] < min){
//                min = prices[i];
//                index = i;
//            }
//
//        }
//        return index;
//    }
//
//    public static int maxElementInArray (int[] prices){
//        int index = 0;
//        int max = prices[index];
//        for (int i = 1;i <prices.length; i++){
//            if (max < prices[i]){
//                max = prices[i];
//                index = i;
//            }
//        }
//        return index;
//    }

//    public static int[] productExceptSelf(int[] nums) {
//        int[] result = new int[nums.length];
//        for (int i = 0, tmp = 1; i < nums.length; i++) {
//            result[i] = tmp;
//            tmp *= nums[i];
//        }
//        for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
//            result[i] *= tmp;
//            tmp *= nums[i];
//        }
//        return result;
//    }



//    public static int missingNumber(int[] nums) {
//        int i;
//        for (i = 0; i < nums.length - 1; i++) {
//            Arrays.sort(nums);
//
//            if (nums[i + 1] - nums[i] != 1) {
//                return nums[i] + 1;
//            }
//        }


//
//    //1.1 -- O(N) Solution
//    public static boolean isUnique(String str) {
//        HashSet<String> hashSet = new HashSet<String>();
//        for (int i = 0; i < str.length(); i++) {
//            String stringValOfIndex = String.valueOf(str.charAt(i));
//            boolean checking = hashSet.add(stringValOfIndex);
//            if (checking == false) {
//                return false;
//            }
//        }
//        return true;
//
//    //1.2 --O(N) + O(M) solution
//    public static boolean checkPermutation(String stringOne, String stringTwo) {
//        if (stringOne.length() != stringTwo.length()) {
//            return false;
//        }
//
//        Hashtable<String, Integer> hashTableOne = new Hashtable<String, Integer>();
//        Hashtable<String, Integer> hashTableTwo = new Hashtable<String, Integer>();
//
//        for (int i = 0; i < stringOne.length(); i++) {
//            int count = 0;
//
//            String stringValueOfIndex = String.valueOf(stringOne.charAt(i));
//
//            if (stringValueOfIndex == null) {
//                hashTableOne.put(stringValueOfIndex, 1);
//            } else {
//                hashTableOne.put(stringValueOfIndex, count +=1);
//            }
//        }
//        for (int i = 0; i < stringTwo.length(); i++) {
//            int count = 0;
//
//            String stringValueOfIndex = String.valueOf(stringTwo.charAt(i));
//
//            if (stringValueOfIndex == null) {
//                hashTableTwo.put(stringValueOfIndex, 1);
//            } else {
//                hashTableTwo.put(stringValueOfIndex, count +=1);
//            }
//        }
//
//        boolean value = hashTableOne.equals(hashTableTwo);
//        return value;
//    }
//
//    //1.3
//
//    public static String uRLIfy(String newString) {
//        StringBuilder stringBuilder = new StringBuilder(newString);
//        char emptyChar = ' ';
//
//        for (int i = 0; i < stringBuilder.length(); i++) {
//            if (stringBuilder.charAt(i) == emptyChar) {
//                stringBuilder.replace(i, i + 1, "%20");
//            }
//        }
//
//        return stringBuilder.toString();
//    }
//
//    public static boolean isPalindrome(String someString) {
//        StringBuilder sb = new StringBuilder(someString);
//        String reversedString = sb.reverse().toString();
//
//        if (someString.equalsIgnoreCase(reversedString)) {
//            return true;
//        }
//        return false;
//    }
//
//    public static boolean palindromePermutation(String stringOne, String stringTwo) {
//        //first lets check if the string are palindrome's
//        //If one of the strings is not a Palindrome we can return false
//        if (isPalindrome(stringOne) != true) {
//            return false;
//        } else {
//            boolean checkIfPermutation = checkPermutation(stringOne, stringTwo);
//            if (checkIfPermutation == false) {
//                return false;
//            } else {
//                return true;
//            }
//        }
//    }
//
//
////    public static boolean oneAway(String stringOne, String stringTwo) {
////
////        // if the strings are identical, it requires zero edits, and should return true
////        if (stringOne.equalsIgnoreCase(stringTwo) == true) {
////            System.out.println("The Strings are identical, and require zero edits");
////            return true;
////        }
////
////        if (stringOne.length() + 1 < stringTwo.length() || stringTwo.length() + 1 < stringOne.length()) {
////            return false;
////        }
////    }
//
//
//
////    public static boolean oneAwayInsert(String stringOne, String stringTwo){
////        StringBuilder sb1 = new StringBuilder(stringOne);
////        StringBuilder sb2 = new StringBuilder(stringTwo);
////
////        for (int i = sb1.length() - 1; i < 0; i--) {
////            for (int j = sb2.length() - 1; j < 0; j--) {
////                if ((sb1.charAt(i) != sb2.charAt(j))) {
////                    sb2.insert(j + 1, sb1.charAt(i));
////                } else {
////                    i--;
////                }
////            }
////        }
////        if (sb1.toString().equalsIgnoreCase(sb2.toString())){
////            return true;
////        }
////    }
//
//    public static int [] twoSum (int [] nums, int key){
////        for(int i = 0; i < nums.length; i++){
////            int b = key - nums[i];
////            System.out.println(b);
////            Set<Integer> set = new HashSet<>(Arrays.stream(nums).boxed().collect(Collectors.toSet()));
////            if(set.contains(b)){
////                return true;
////            }
////        }
////        return false;
//
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for (int i = 0; i < nums.length; i ++){
//            Integer indecks = new Integer(nums[i]);
//            Integer element = new Integer(i);
//
//            map.put(indecks, element);
//            int difference = nums[i] - key;
//
//            if (map.containsKey(difference) == true){
//                return new int [] { map.get(indecks) , map.get(difference)};
//            }
//        }
//        return new int [] {-1,-1};
//    }
//
//    public static boolean threeSum (int [] nums, int key){
//        for (int i = 0; i<nums.length; i ++){
//            for (int j = i +1 ; j<nums.length; j++){
//                int x = (nums[i] + nums [j]) * -1;
//                System.out.println(x);
//                Set<Integer> set = new HashSet<>(Arrays.stream(nums).boxed().collect(Collectors.toSet()));
//                if(set.contains(x)){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    public static String compressedString (String uncompressedString){
//        //We can use a string builder to add the new String
//        StringBuilder compressingTheString = new StringBuilder();
//        int count = 1;
//        for (int i = 0; i < uncompressedString.length()-1; i ++) {
//            if (uncompressedString.charAt(i) == uncompressedString.charAt(i + 1)) {
//                count++;
//                compressingTheString.append(uncompressedString.charAt(1) + count);
//            } else {
//                compressingTheString.append(uncompressedString.charAt(i) + "1");
//            }
//        }
//        String cumpStr =compressingTheString.toString();
//        if (uncompressedString.length() > compressingTheString.length()){
//            return cumpStr;
//        }
//        else {
//            return uncompressedString;
//        }
//    }
////
////    public static int returnIndicesThatSumToTarget (int [] arr, int target){
////
////    }
//
//
//    public class ListNode {
//        int val;
//        ListNode next;
//
//        ListNode() {
//        }
//
//        ListNode(int val) {
//            this.val = val;
//        }
//
//        ListNode(int val, ListNode next) {
//            this.val = val;
//            this.next = next;
//        }
//    }
//    public ListNode addTwoNumbers(LinkedList l1, LinkedList l2){
//        ListNode dummyHead = new ListNode(0);
//        ListNode curr = dummyHead;
//    }

