package queue;

import java.util.Deque;
import java.util.LinkedList;

public class DQCF {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addFirst(5);//5,1,2,3,4
        dq.removeLast();//5,1,2,3,4
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
    }
}
