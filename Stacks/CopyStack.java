package Stacks;

import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Given Stack: "+st);
        Stack<Integer> temp = new Stack<>();
        while (!st.isEmpty()) {
            temp.push(st.pop());
            // int ele=st.pop();
            // stRev.push(ele);
        }
        System.out.print("Temporary Stack: ");
        System.out.println(temp);
        Stack<Integer> ansStack = new Stack<>();
        while (!temp.isEmpty()) {
            ansStack.push(temp.pop());
        }
        System.out.print("Copied stack is:");
        System.out.println(ansStack);
    }
}
