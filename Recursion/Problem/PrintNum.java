package Recursion.Problem;

public class PrintNum {
    // public static int printer(int n){
    //     if(n==1){
    //         System.out.println(n);
    //         return 1;
    //     }
    //     if (printer(n)==1) {
    //     }
    //     else{
    //         System.out.println(n);
    //     }
    //     return printer(n-1);
    // }
    public static void main(String[] args) {
        printer(3);
    }

    private static void printer(int i) {
        if (i==0) {
            return;
        }
        System.out.println(i);
        printer(i-1);
        return;
    }

//     private static int printer(int i) {
//       if (i==0) {
//         return 0;
//       }
//       System.out.println(i);
//        return printer(i-1);
// }
}
