package Recursion.Problem;

public class stairPath2 {
    public static void main(String[] args) {
        System.out.println(stairPathx(7));
    }
    public static int stairPathx(int n){
        if (n<=0) {
            System.out.println("Chal Chutiye");
        }
        else if (n==1) {
            return 1;
        }
        else if(n<=3) {
            return n-1;
        }
        return stairPathx(n-1) + stairPathx(n-3);
    }
}
