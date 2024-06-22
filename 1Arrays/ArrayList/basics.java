package Arrays.ArrayList;

import java.util.ArrayList;

public class basics {
    public static void main(String[] args) {
        int[] arrays = new int[6];
        ArrayList<Integer> arr = new ArrayList<>(6);
        System.out.println(arr);//khali array NOT initialised by 0's
        //sout(arr.get(0)); it will give error
        arr.add(0,10);//initialize
        arr.add(1,20);
        arr.add(2,10);
        arr.add(3,10);
        arr.add(4,10);
        arr.add(5,10);
        System.out.println(arr.size());

        System.out.println(arr.get(0));
        for (int i = 0; i < 5; i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        System.out.println(arr);
        for ( int a : arrays) {
            System.out.print(a+" ");//Initialised by zeros
        }
        System.out.println();
        arr.set(2, 300);
        System.out.println(arr);

        arr.add(90);//in the end lg jaega(push back>>)
        System.out.println(arr.size());
    }
    
}
