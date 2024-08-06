package Stacks;

import java.util.Stack;

public class basicsOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(5);
        st.push(10);
        st.push(20);
        System.out.println(st.isEmpty());
        System.out.println(st);
        System.out.println(st.peek());//gives the topmost element that is pushed at last
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st);
        st.push(10);
        st.push(20);
        System.out.println(st);
        while (st.size()>1) {//To access first element in stack
            st.pop();
        }
        //size has become 1
        System.out.println(st.peek());
    }
}
