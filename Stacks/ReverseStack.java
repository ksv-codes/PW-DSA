package Stacks;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Given Stack: "+st);
        Stack<Integer> stRev = new Stack<>();
        while (!st.isEmpty()) {
            stRev.push(st.pop());
            // int ele=st.pop();
            // stRev.push(ele);
        }
        System.out.print("Reversed Stack: ");
        System.out.println(stRev);
    }
}
