package Arrays;

public class Q2sumofArray {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        int n = arr.length;
        int sum=0;
        if (n==0) {
            System.out.println("give some inputs");
        }
        else{
            for (int i = 0; i < n; i++) {
                sum+=arr[i];
            }
            System.out.println(sum);
        }
    }
}
