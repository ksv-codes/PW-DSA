package SortingAlgorithm.Theory;

public class CheckifArrayisSortedorNot {
    public static void main(String[] args) {
        int[] a = {1,7,3,8,9,12};
        int n = a.length;
        boolean flag = true;
        for (int i = 0; i < n-1; i++) {
            if (a[i]>a[i+1]) {
                //System.out.println("Unsorted");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Sorted");
        }
        else{
            System.out.println("UnSorted");
        }
    }
}
