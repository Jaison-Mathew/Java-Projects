public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        if (number < 0){
            number *= -1;
        }

        int num = number;
        int reverse = 0;
        while (number > 0){
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;

        }

        if (reverse == num){
            return true;
        }else {
            return false;
        }
    }
}
