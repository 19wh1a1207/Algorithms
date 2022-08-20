package Placements.Striver;

import java.util.HashSet;

public class longestconsecutiveseq {
    public static void main(String[] args) {
        int[] a = {7, 101, 100, 2, 102, 3, 4, 103};
        HashSet<Integer> hs = new HashSet<>();
        for(int num: a)
            hs.add(num);
        int res = 0;
        for(int i = 0; i < a.length; i++){
            if(!hs.contains(a[i] - 1)){
                int curr = a[i];
                int ans = 1;
                while(hs.contains(curr + 1)){
                    curr += 1;
                    ans += 1;
                }
                res = Math.max(res, ans);
            }
        }
        System.out.println(res);
    }
}
