package com.ccsi;

public class Main {

    public static void main(String[] args) {
        System.out.println(countPrimes2(10));
    }
    //Count the number of prime numbers less than a non-negative number,n.
    //O(n1.5)
    public static int countPrimes1(int n){
        int count=0;
        for (int i = 1; i < n; i++) {
            if(isPrime(i))count++;
        }
        return count;
    }
    private static boolean isPrime(int m){
        if(m<=1)return false;
        for (int i = 2; i*i <= m; i++) {           //sqrt() is more expensive
            if(m%i==0)return false;
        }
        return true;
    }
    //most efficient way
    public static int countPrimes2(int n){
        int count=0;
        boolean[] notPrimes=new boolean[n];
        for (int i = 2; i < n; i++) {
            if(!notPrimes[i]){
                count++;
                for (int j = 2; j*i <n; j++) {
                    notPrimes[j*i]=true;
                }
            }else{
                continue;
            }
        }
        return count;
    }
}
