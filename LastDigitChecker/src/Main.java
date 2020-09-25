public class Main {

    public static void main(String[] args) {

        boolean result1 = LastDigitChecker.hasSameLastDigit(41, 22, 71);
        System.out.println(result1);
        result1 = LastDigitChecker.hasSameLastDigit(23, 32, 42);
        System.out.println(result1);
        result1 = LastDigitChecker.hasSameLastDigit(9, 99, 999);
        System.out.println(result1);

        boolean result2 = LastDigitChecker.isValid(10);
        System.out.println(result2);
        result2 = LastDigitChecker.isValid(468);
        System.out.println(result2);
        result2 = LastDigitChecker.isValid(1051);
        System.out.println(result2);
    }
}
