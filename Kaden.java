class Kaden {
    public static void main(String[] args) {
         int[] a = {-1, 3, 4, -2, -5, 9, -2, 11, 3, -7};
         int max_prev = Integer.MIN_VALUE, max_curr = 0;
         for(int i = 0; i < a.length; i++){
            max_curr += a[i];
            if(max_prev < max_curr)
                max_prev = max_curr;
            if(max_curr < 0)
                max_curr = 0;
         }
         System.out.println(max_prev);
    }
}
