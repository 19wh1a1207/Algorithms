package Placements.Striver;

public class buynsell {
    public static void main(String[] args) {
        int[] p = {9, 1, 3, 5, 7, 2};
        int min = Integer.MAX_VALUE, maxPro = 0;
        for(int i = 0; i < p.length; i++){
            if(p[i] < min)
                min = p[i];
            if(p[i] - min > maxPro)
                maxPro = p[i] - min;
        }
        System.out.println(maxPro);
    }
}
