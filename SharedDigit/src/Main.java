public class Main {

    public static void main(String[] args) {

        boolean result = SharedDigit.hasSharedDigit(12, 23);
        System.out.println(result);
        result = SharedDigit.hasSharedDigit(9, 99);
        System.out.println(result);
        result = SharedDigit.hasSharedDigit(12, 44);
        System.out.println(result);
    }
}
