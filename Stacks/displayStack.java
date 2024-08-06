package Stacks;

import java.util.Stack;

public class displayStack {
    public static void displayRec(Stack<Integer> s){//it's call by refernce jo change s me kroge woh main st me bhi kr dunga
        
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        //METHOD:1
        //System.out.println(st);
        // Stack<Integer> rt = new Stack<>();
        // while (st.size()>0) {
        //     rt.push(st.pop());
        // }
        // while (rt.size()>0) {
        //     int x = rt.pop();
        //     System.out.print(x+" ");
        //     st.push(x);
        // }
        
        //METHOD:2
        // int n = st.size();
        // int[] arr = new int[n];
        // for (int i = n-1; i >=0; i--) {
        //     arr[i] = st.pop();
        // }
        // for (int i = 0; i < n; i++) {
        //     System.out.println(arr[i]+" ");
        //     st.push(arr[i]);
        // }

        //METHOD:3
        displayRec(st);
    }
}
