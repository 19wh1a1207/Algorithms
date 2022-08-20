package Placements.Striver;

import java.util.Arrays;

public class zeroes {
    public static void main(String[] args) {
        int[][] ar= {{1, 0, 1, 1},
                    {0, 1, 1, 0},
                    {1, 1, 1, 1}};
        int col0 = 0;
        for(int i = 0; i < ar.length; i++){
            if(ar[i][0] == 0) col0 = 1;
            for(int j = 1; j < ar[0].length; j++){
                if(ar[i][j] == 0)
                    ar[i][0] = ar[0][j] = 0;
            }
        }

        for(int i = ar.length - 1; i >= 0; i--){
            for(int j = ar[0].length - 1; j >= 1; j--){
                if(ar[i][0] == 0 || ar[0][j] == 0)
                    ar[i][j] = 0;
            }
            if(col0 == 1)
                ar[i][0] = 0;
        }
        for(int[] i: ar)
            System.out.println(Arrays.toString(i));
    }
}
