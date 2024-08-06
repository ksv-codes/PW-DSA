package Stacks;
import java.util.Stack;
public class RevByRecursion {
    public static void displayRev(Stack<Integer> s){
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
                                                //displayRev(s); if we want the same sequence
        System.out.print(top+" ");
        displayRev(s);                           //it will print in reverse
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        displayRev(st);
    }
}
