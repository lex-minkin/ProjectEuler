/**
 * Created by Leshiy on 06.06.14.
 */

/*
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
*/

public class LargestPrimeFactor {
    public static void main(String[] args) {
        double n = 600851475143.0;
        //double n = 15485863.0;
        PrimeNumberCalculator pncalc = new PrimeNumberCalculator();
        int maxfactor = pncalc.primelist.get(0);
        int i = 0;
        boolean isDone = false;
        while(!isDone){
            if ((n % pncalc.primelist.get(i)) == 0){
                n = n / pncalc.primelist.get(i);
                maxfactor = pncalc.primelist.get(i);
                if (n == 1.0)
                    isDone = true;
            }
            else{
                pncalc.findNextPrime();
                i++;
            }
        }
        System.out.print("Largest prime factor is: " + maxfactor);
    }
}
