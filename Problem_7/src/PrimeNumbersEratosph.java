import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by adm on 08.06.2014.
 */
public class PrimeNumbersEratosph implements IPrimeNumbers {
    private ArrayList<Integer> primelist = new ArrayList<Integer>();

    @Override
    public void findPrimeNumbers(int n) {
        ArrayList<Integer> primes;
        if (n < 0)
            return;
        boolean[] isPrime = new boolean[n + 1];

       // primes.add(2);
        int i;
        int j;
        for (i = 2; i < n + 1; i++)
            isPrime[i] = true;

        for(i = 2; i < Math.sqrt(n) + 1; i++)
            if (isPrime[i])
                for (j = i * i; j < n + 1; j += i)
                    isPrime[j] = false;
                    /*
                    if (isPrime[j])
                        if(j % i == 0)
                            isPrime[j] = false;
                            */


    for(i = 0 ; i < n + 1; i++)
        if(isPrime[i])
            primelist.add(i);

    }

    @Override
    public ArrayList<Integer> getPrimeList() {
        return primelist;
    }
}
