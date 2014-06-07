import java.util.ArrayList;
import java.util.List;

/**
 * Created by Leshiy on 05.06.14.
 */
public class PrimeNumberCalculator {
    public ArrayList<Integer> primelist;

    public PrimeNumberCalculator(){
        primelist = new ArrayList<Integer>();
        primelist.add(2);
    }

    public PrimeNumberCalculator(int n){
        primelist = new ArrayList<Integer>();
        primelist.add(2);
        findPrimeNumbers(n);
    }

    public void findPrimeNumbers(int n){
        int i;
        for (i = 3; i <= n; i = i + 2){
            if (isPrime(i))
                primelist.add(i);
        }
    }

    public void findNextPrime(){
        int lastnumber = primelist.get(primelist.size() - 1);
        int nextnumber;
        if (lastnumber == 2)
            nextnumber = 3;
        else
            nextnumber = lastnumber + 2;
        while (true)
        {
            if (isPrime(nextnumber)){
                primelist.add(nextnumber);
                break;
            }
            else
                nextnumber += 2;
        }
    }

    private boolean isPrime(int n){
        int i;
        boolean isPrimeNumber = true;
        int sqroot = (int)Math.sqrt(n);
        for(i = 0; i < primelist.size(); i++){
            if (primelist.get(i) > sqroot)
                break;
            if ((n % primelist.get(i) == 0 )){
                isPrimeNumber = false;
                break;
            }
        }
        return isPrimeNumber;
    }

}
