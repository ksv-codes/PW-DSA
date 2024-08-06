package Stacks;

import java.util.Stack;

public class PushAtIndex {
    public static void main(String[] args) {
        int idx=2;
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Given Stack: "+st);
        Stack<Integer> st_temp = new Stack<>();
        while (st.size()>idx) {
            st_temp.push(st.pop());
        }
        System.out.println("Temp stack"+st_temp);
        st.push(100);
        while (st_temp.size()>0) {
            st.push(st_temp.pop());
        }
        System.out.println("our stack "+st);
    }
}
