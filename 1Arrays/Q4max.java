package Arrays;

public class Q4max {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,5,6};
        int max = arr[0];//int max= Interger.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max) //agr ek hi statement h toh no need of{}
                max=arr[i];//mx=Math.max(max,arr[i]);
            
        }
        System.out.println(max);
    }
}
