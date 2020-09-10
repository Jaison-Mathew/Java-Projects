public class Main {

    public static void main(String[] args) {
        boolean result = LeapYearCalculator.isLeapYear(-1600);
        System.out.println(result);
        result = LeapYearCalculator.isLeapYear(1600);
        System.out.println(result);
        result = LeapYearCalculator.isLeapYear(2017);
        System.out.println(result);
        result = LeapYearCalculator.isLeapYear(2000);
        System.out.println(result);
    }
}
