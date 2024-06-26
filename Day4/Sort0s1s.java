public class Sort0s1s {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,0,1,0,1,1,0};
        int n = arr.length;
        int noOfZeroes =0;
        //int noOfones =0;
        for (int i = 0; i < n; i++) {
            if (arr[i]==0) {
                noOfZeroes++;
            }
            
        }
        for (int i = 0; i < noOfZeroes; i++) {
            arr[i]=0;
        }
        for (int i = noOfZeroes; i < arr.length; i++) {
            arr[i]=1;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
}
