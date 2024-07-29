package MergeSortAlgo.Theory;
public class MergeSort {
    public static void PrintArray(int[] arr){
        for (int i : arr) System.out.print(i+" ");
        System.out.println();
    }
    public static void Merger(int[] a, int[] b, int[] c) {
            int i=0,j=0,k=0;// int i = 0;int j = 0;int k = 0;
            while (i<a.length && j<b.length) {
               if (a[i]<=b[j]) c[k++] = a[i++]; //pehle use krlo then badha do it;s the same damn thing
               else c[k++] = b[j++];
            }
            while (j<b.length) c[k++]=b[j++];//FOR BACHI HUI b ARRAY agar a araay pehle complete ho jae toj//if (i==a.length) 
            while (i<a.length) c[k++]=a[i++];//if (j==b.length) 
        }
    public static void mergeSorter(int[] arr) {
       int n= arr.length;
       if (n==1) return;//Base Case
       //Dividing the array into two parts
       int[] a = new int[n/2];
       int[] b = new int[n-(n/2)];
       //Put arr ke elements into a and b
       for (int i = 0; i < n/2; i++) a[i]=arr[i];
       for (int i = 0; i < b.length; i++) b[i]=arr[i+n/2];
       mergeSorter(a);mergeSorter(b);
       //Merge a&b(two sorted arrays)
       Merger(a, b, arr);
    }
    public static void main(String[] args) {
        int[] arr = {80,30,50,20,60,70,40};
        System.out.print("Array before Sorting: ");PrintArray(arr);
        mergeSorter(arr);
        System.out.print("Array after Sorting: ");PrintArray(arr);
    }
}
