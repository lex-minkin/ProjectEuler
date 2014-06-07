/**
 * Created by Leshiy on 07.06.14.
 */

/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
*/
public class SumOfPrimes {
    public static void main(String[] args) {
        int n = 2000000;
        PrimeNumberCalculator pncalc = new PrimeNumberCalculator(n);
        long sum = 0;
        for(Integer i : pncalc.primelist){
            sum += i;
            System.out.println(i);
        }
        System.out.println("Sum of all the primes below " + n + " is " + sum);
    }
}
