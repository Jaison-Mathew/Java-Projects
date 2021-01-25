package com.timbuchalka;

public class Series {
    private int numValue;

    // returns sum of all numbers from 0 to n
    public static int nSum(int n){
        int sum = 0;
        for (int i = 0; i<= n; i++){
            sum += i;
            System.out.println(sum);
        }
        return sum;
        // or just return (n * (n - 1)) / 2;
    }

    // returns product of all numbers from 1 to n
    public static int factorial(int n){
        if (n == 0){
            return 1;
        }
        int product = 1;
        for (int x = 1; x <= n; x++){
            product *= x;
            System.out.println(product);
        }
        return product;
    }

    // returns nth fibonacci number
    public static int fibonacci(int n){

        if (n == 0){
            System.out.println(0);
            return 0;
        }else if ((n == 1)){
            System.out.println(1);
            return 1;
        }

        int nMinus1 = 1;
        int nMinus2 = 0;
        int fib = 0;

        for (int i = 1; i<n; i++){
            fib = (nMinus2 + nMinus1);
            nMinus2 = nMinus1;
            nMinus1 = fib;
            System.out.println(fib);
        }
        return fib;

    }
}