package io.mwk;

import java.io.InputStreamReader;
import java.util.Scanner;

public class CountWaysApp {
    public static void main(String[] args){
        System.out.println("Please enter number of identical balls: ");
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int noOfBalls = scanner.nextInt();
        scanner.close();
        int noOfWays = ways(noOfBalls);
        System.out.println("Number of ways for > " + noOfBalls +" < identical balls is > "+noOfWays+" <");
    }

    public static int ways(int n){
        if(n <= 1){
            return 1;
        }
        return ways(n-1)+ways(n-2);
    }
}
