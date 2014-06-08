/**
 * Created by adm on 08.06.2014.
 */
public class LargestPalindromeProduct {
    public static void main(String[] args) {
        System.out.println(isPalindrome(25152));
        System.out.println(isPalindrome(12345));
        int largestpalindrome = 0;
        for (int i = 100; i < 1000; i++)
            for (int j = 100; j < 1000; j++){
                if(isPalindrome(i * j))
                    if ((i * j) > largestpalindrome)
                    largestpalindrome = i * j;
            }

        System.out.println(largestpalindrome);
    }

    public static boolean isPalindrome(int n){
        String s = Integer.toString(n);
        for (int i = 0; i < s.length()/2; i++){
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }
}
