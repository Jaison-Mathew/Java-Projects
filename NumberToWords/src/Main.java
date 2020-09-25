public class Main {

    public static void main(String[] args) {

        NumberToWords.numberToWords(546);
        NumberToWords.numberToWords(1234);
        NumberToWords.numberToWords(230);
        NumberToWords.numberToWords(100);
        NumberToWords.numberToWords(0);

        int digitSumResult = NumberToWords.getDigitCount(0);
        System.out.println(digitSumResult);
        digitSumResult = NumberToWords.getDigitCount(123);
        System.out.println(digitSumResult);
        digitSumResult = NumberToWords.getDigitCount(-12);
        System.out.println(digitSumResult);
        digitSumResult = NumberToWords.getDigitCount(5200);
        System.out.println(digitSumResult);


        int result = NumberToWords.reverse(-121);
        System.out.println(result);
        result = NumberToWords.reverse(1212);
        System.out.println(result);
        result = NumberToWords.reverse(1234);
        System.out.println(result);
        result = NumberToWords.reverse(100);
        System.out.println(result);



    }
}
