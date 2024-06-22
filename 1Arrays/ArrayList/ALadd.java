package Arrays.ArrayList;

import java.util.ArrayList;

public class ALadd {
   public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    //list.add(0,53); error bcz khali list me index hote hi nhi hain
    list.add(32);
    list.add(60);
    System.out.println(list);
    list.remove(1);
    list.add(34);
    list.add(342);
    list.add(3422);
    System.out.println(list);
    list.remove(2);
   }
}
