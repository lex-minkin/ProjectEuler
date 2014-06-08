/**
 * Created by adm on 08.06.2014.
 */
public class SpecialPythagoreanTriplet {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        for (a = 1; a < 1000; a++)
            for (b = 1; b < 1000; b++) {
                c = 1000 - a - b;
                if (c <= 0)
                    break;
                if ((a * a + b * b) == c * c) {
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                    System.out.println(a * b * c);
                    return;
                }

            }
    }
}
