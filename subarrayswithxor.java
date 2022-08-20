package Placements.Striver;

import java.util.HashMap;

public class subarrayswithxor {
    public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4};
        int target = 6;
        HashMap<Integer, Integer> m = new HashMap<>();
        int xor = 0, cnt = 0;
        for(int i = 0; i < a.length; i++){
            xor ^= a[i];
            if(xor == target)
                cnt++;
            if(m.containsKey(xor ^ target))
                cnt += m.get(xor ^ target);
            if(m.containsKey(xor))
                m.put(xor, m.get(xor) + 1);
            else
                m.put(xor, 1);
        }
        System.out.println(cnt);
    }
}
