package Placements.Striver;

import java.util.Arrays;

public class nextPerm {
    public static void main(String[] args) {
        int[] a = {6, 1, 3, 4, 2, 1};
        next(a);
        System.out.println(Arrays.toString(a));
    }

    public static void next(int[] a){
        int n = a.length;
        int p = n - 2;
        while (p >= 0 && a[p] > a[p + 1]){
            p--;
        }
        if(p >= 0){
            int i = n - 1;
            while (a[i] <= a[p]) i--;
            swap(a, i, p);
        }
        reverse(a, p + 1, n - 1);
    }

    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void reverse(int[] a, int i, int j){
        while (i <= j){
            swap(a, i++, j--);
        }
    }
}
