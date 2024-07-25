package Recursion.Problem;
public class stairPath {
    public static void main(String[] args){
        System.out.println(stair(5));
    }
    public static int stair(int n){
        if (n<=0) System.out.println("Chal chutiye");
        if (n<=2) return n;
        return stair(n-1) + stair(n-2);
    }
}
