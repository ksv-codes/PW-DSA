package queue;

import java.util.LinkedList;
import java.util.Queue;

public class basicCF {
    public static void main(String[] args) {//queue is Interface od collection interface just like List iNterface ArrayList is subclass of list Interface
        Queue<Integer> q = new LinkedList<>();//LinkedListImplementationQueue
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.size());
        System.out.println(q);
        q.remove();
        System.out.println(q);//1 will be removed means jisko pehle add kiya tha whi pehle remove hoga
        q.poll();//remove 2
        System.out.println(q);
        System.out.println(q.element());//3 will print the front
        System.out.println(q.peek());//4 as it is as peek in  front
    }
}
