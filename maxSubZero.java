package Placements.Striver;

import java.util.HashMap;

public class maxSubZero {
    public static void main(String[] args) {
        int[] a = {3, -1, 1, 2, 4, -1, -3, 7, -8, 1};
        HashMap<Integer, Integer> m = new HashMap<>();
        int sum = 0, res = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
            if(sum == 0)
                res = i + 1;
            else{
                if(!m.containsKey(sum)){
                    m.put(sum, i);
                }
                else{
                    res = Math.max(res, i - m.get(sum));
                }
            }
        }
        System.out.println(res);
    }
}
