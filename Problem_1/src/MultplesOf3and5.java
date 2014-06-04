/**
 * Created by Leshiy on 04.06.14.
 */
/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
*/

public class MultplesOf3and5 {
    public static void main(String[] args) {
        System.out.println(multiplesSum(1000));
    }

    public static int multiplesSum(int n){
        int i;
        int sum = 0;
        for (i = 1; i < n; i++) {
            if((i % 3 == 0) || (i % 5 == 0))
                sum+=i;
        }
        return sum;
    }
}
