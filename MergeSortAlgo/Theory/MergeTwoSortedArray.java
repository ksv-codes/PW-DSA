package MergeSortAlgo.Theory;

public class MergeTwoSortedArray {
    public static void PrintArray(int[] arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
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
    public static void main(String[] args) {
        int[] a = {10,30,50,60,80,90};
        int[] b = {21,42,72,78};
        System.out.print("1st Sorted array: ");PrintArray(a);
        System.out.print("2nd Sorted array: ");PrintArray(b);
        int[] c = new int[a.length + b.length];
        Merger(a,b,c);
        System.out.print("Merged Sorted array: ");PrintArray(c);
    }
    
}
