import java.util.ArrayList;
import java.util.List;
/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?
*/

/**
 * Created by Leshiy on 05.06.14.
 */
public class Prime10001 {
    public static void main(String[] args) {
        int n = 10001;
        PrimeNumberCalculator pncalc = new PrimeNumberCalculator();

        while(pncalc.primelist.size() < n)
        {
            pncalc.findNextPrime();
            System.out.println(pncalc.primelist.get(pncalc.primelist.size() - 1));
        }

        for(Integer i : pncalc.primelist)
            System.out.println(i);
        System.out.println();
        System.out.println("The " + n + " prime number is " + pncalc.primelist.get(n - 1));
    }
}
