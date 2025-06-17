import java.util.ArrayList;
import java.util.Stack;

import java.util.*;

public class NextGreaterElement {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int[] nextGreater = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = s.peek();
            }

            s.push(arr[i]);
        }

        // Convert array to ArrayList
        ArrayList<Integer> result = new ArrayList<>();
        for (int val : nextGreater) {
            result.add(val);
        }

        return result;
    }

    public static void main(String[] args) {
        NextGreaterElement obj = new NextGreaterElement();
        int[] arr = {4, 5, 2, 25};
        System.out.println(obj.nextLargerElement(arr));  // Output: [5, 25, 25, -1]
    }
}

