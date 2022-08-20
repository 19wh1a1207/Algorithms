package Placements.Striver;
//moore voting alg
public class maj {
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 1, 1, 2};
        int cnt = 0, ele = 0;
        for(int i = 0; i < a.length; i++){
            if(cnt == 0)
                ele = a[i];
            if(a[i] == ele)
                cnt++;
            else
                cnt--;
        }
        System.out.println(ele);
    }
}
