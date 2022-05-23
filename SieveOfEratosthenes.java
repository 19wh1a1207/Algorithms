class SieveOfEratosthenes {
    public static void main(String[] args) {
        boolean[] flag = new boolean[40];
        flag[0] = true;
        flag[1] = true;
        for(int i = 2; i < 40; i++){
            if(!flag[i]){
                for(int j = i + i; j < 40; j += i)
                    if(j % i == 0)
                        flag[j] = true;
            }
        }
        for(int i = 1; i < 40; i++){
            if(!flag[i])
                System.out.print(i + " ");
        }
    }
}
