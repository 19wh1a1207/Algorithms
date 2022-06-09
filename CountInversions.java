// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        int[] ar = {3, 6, 2, 1, 5, 1};
        int res = mergeSortAndCount(ar, 0, 5);
        System.out.println(res);
    }
    
    public static int mergeSortAndCount(int[] ar, int lo, int hi){
        int count = 0;
        if(lo < hi){
            int mid = (lo + hi)/2;
            count += mergeSortAndCount(ar, lo, mid);
            count += mergeSortAndCount(ar, mid + 1, hi);
            count += mergeSort(ar, lo, mid, hi);
        }
        return count;
    }
    
    public static int mergeSort(int[] ar, int lo, int mid, int hi){
        int i = 0, j = 0, k = lo, swaps = 0;
        int[] left = Arrays.copyOfRange(ar, lo, mid + 1);
        int[] right = Arrays.copyOfRange(ar, mid + 1, hi + 1);
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                ar[k++] = left[i++];
            }
            else{
                ar[k++] = right[j++];
                swaps += ((mid + 1) - (lo + i));
            }
        }
        while(i < left.length){
            ar[k++] = left[i++];
        }
        while(j < right.length){
            ar[k++] = right[j++];
        }
        return swaps;
    }
}
