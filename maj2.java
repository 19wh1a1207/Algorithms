package Placements.Striver;
//moore voting alg
public class maj2 {
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 1, 1, 2, 2, 3};
        int cnt1 = 0, cnt2 = 0, ele1 = -1, ele2 = -1;
        for(int i = 0; i < a.length; i++){
            if(a[i] == ele1) cnt1++;
            else if(a[i] == ele2) cnt2++;
            else if(cnt1 == 0){
                ele1 = a[i];
                cnt1 = 1;
            }
            else if(cnt2 == 0) {
                ele2 = a[i];
                cnt2 = 1;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        System.out.println(ele1 + " " + ele2);
    }
}
