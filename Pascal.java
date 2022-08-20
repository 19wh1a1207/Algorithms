package Placements.Striver;

public class Pascal {
    public static void main(String[] args) {
        int res = 1;
        int n = 5;
        System.out.print(res + " ");
        for(int i = 1; i < 5; i++) {
            res *= (n - i);
            res /= (i);
            System.out.print(res + " ");
        }
    }
}
