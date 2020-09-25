public class Main {

    public static void main(String[] args) {

        int result = EvenDigitSum.getEvenDigitSum(123456789);
        System.out.println("The sum of the even digits is " + result);
        result = EvenDigitSum.getEvenDigitSum(252);
        System.out.println("The sum of the even digits is " + result);
        result = EvenDigitSum.getEvenDigitSum(-22);
        System.out.println("The sum of the even digits is " + result);
    }
}
