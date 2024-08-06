package Stacks;
import java.util.Stack;
public class REVStack {
    public static void revbyrecur(Stack<Integer> s){
        if (s.size()==1) {
            return;
        }
        int top = s.pop();
        revbyrecur(s);
        pushAtbottom(top,s);
    }
    public static void pushAtbottom(int x,Stack<Integer> s) {
        if (s.size()==0) {
            s.push(x);
            return;
        }
        int top=s.pop();
        pushAtbottom(x, s);
        s.push(top);
    }
    public static void main(String[] args) {
        //Iterative solution
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println("st stack: "+ st);
        // Stack<Integer> rt = new Stack<>();
        // while (st.size()>0) {
        //     rt.push(st.pop());
        // }
        // System.out.println("rt stack: "+ rt);
        // Stack<Integer> qt = new Stack<>();
        // while (rt.size()>0) {
        //     qt.push(rt.pop());
        // }
        // System.out.println("qt stack: "+ qt);
        // while (qt.size()>0) {
        //     st.push(qt.pop());
        // }
        // System.out.println("st stack: "+ st);

    }
}
