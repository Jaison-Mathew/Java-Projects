public class Main {

    public static void main(String[] args) {

        boolean leap = NumberOfDaysInMonth.isLeapYear(-1600);
        System.out.println(leap);
        leap = NumberOfDaysInMonth.isLeapYear(1600);
        System.out.println(leap);
        leap = NumberOfDaysInMonth.isLeapYear(2017);
        System.out.println(leap);
        leap = NumberOfDaysInMonth.isLeapYear(2000);
        System.out.println(leap);

        int days = NumberOfDaysInMonth.getDaysInMonth(1, 2020);
        System.out.println(days);
        days = NumberOfDaysInMonth.getDaysInMonth(2, 2020);
        System.out.println(days);
        days = NumberOfDaysInMonth.getDaysInMonth(2, 2018);
        System.out.println(days);
        days = NumberOfDaysInMonth.getDaysInMonth(-1, 2020);
        System.out.println(days);
        days = NumberOfDaysInMonth.getDaysInMonth(1, -2020);
        System.out.println(days);

    }
}
