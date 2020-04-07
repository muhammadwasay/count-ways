package io.mwk;

public class App {
    public static void main(String[] args){
        int n = 5;
        System.out.println(ways(n));
    }

    public static int ways(int n){
        if(n <= 1){
            return 1;
        }
        return ways(n-1)+ways(n-2);
    }
}
