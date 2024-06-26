public class Q9Rev2Pt {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        for (int i : arr) {
            System.out.print(i +" ");
        }
        System.out.println();
        int n = arr.length;
        int i = 0;//starting of index to be reversed inti=1;
        int j = n-1;//ending of index to be reversed int j = 5;
        while (i<=j) {
            changeindices(arr,i,j);
            i++;
            j--;
        }
        for (int k : arr) {
            System.out.print(k+" ");
        }
    }

    public static void changeindices(int[] arr, int i, int j) {
       int temp = arr[i];
       arr[i]= arr[j];
       arr[j]= temp;
    }
}
