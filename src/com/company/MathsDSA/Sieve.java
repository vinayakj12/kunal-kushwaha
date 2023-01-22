package com.company.MathsDSA;

public class Sieve {

    public static void main(String[] args) {
        int n = 11;
        // False in array means all of them are primes
        boolean[] primes = new boolean[n+1];
//        System.out.println(primes[4]);
        sieve(n,primes);
    }

    private static void sieve(int n, boolean[] primes) {

        // * we have to mark till root n between the range that we have to find the prime numbers.
        for (int i = 2; i * i <= n; i++) {

            if (!primes[i])
            {
                for (int j = i*i; j <= n; j= j+i) {
                    primes[j] = true;

                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!primes[i])
            {
                System.out.print(i + " ");
            }
        }
    }
}
