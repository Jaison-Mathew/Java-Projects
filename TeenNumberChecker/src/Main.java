public class Main {

    public static void main(String[] args) {

        boolean result = TeenNumberChecker.hasTeen(9, 99, 19);
        System.out.println(result);
        result = TeenNumberChecker.hasTeen(23, 15, 42);
        System.out.println(result);
        result = TeenNumberChecker.hasTeen(22, 23, 34);
        System.out.println(result);

        boolean isTeen = TeenNumberChecker.isTeen(9);
        System.out.println(isTeen);
        isTeen = TeenNumberChecker.isTeen(13);
        System.out.println(isTeen);
    }
}
