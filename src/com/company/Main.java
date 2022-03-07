package com.company;

public class Main {

    public static void main(String[] args) {
        //System.out.println(powWithTwo(5));
        //System.out.println(powWithX(2, 5));
        //System.out.println(sumWithN(5));


    }

    //Method for 18.2.4
    public static int powWithTwo(int n) {
        if (n == 1) {
            return 2;
        } else {
            return 2 * powWithTwo(n - 1);
        }
    }

    //Methid for 18.2.5
    public static int powWithX(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * powWithX(x, n - 1);
        }
    }

    //Method for 18.2.6
    public static int sumWithN(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumWithN(n - 1);
        }
    }



}
