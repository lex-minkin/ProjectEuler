/**
 * Created by Leshiy on 04.06.14.
 */
public class SumSquareDifference {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(squareSum(n) - sumSquare(n));
    }

    public static int sumSquare(int n) {
        int sum = 0;
        int i;
        for (i = 1; i <= n; i++) {
            sum += i*i;
        }
        return sum;
    }

    public static int squareSum(int n) {
        int sum = 0;
        int i;
        for (i = 1; i <= n; i++) {
            sum += i;
        }
        return sum*sum;
    }
}
