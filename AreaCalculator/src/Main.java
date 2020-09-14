public class Main {

    public static void main(String[] args) {

        double result = AreaCalculator.area(5.0);
        System.out.println("The area of the circle is " + result);
        result = AreaCalculator.area(-1);
        System.out.println("The area of the circle is " + result);
        result = AreaCalculator.area(5.0, 4.0);
        System.out.println("The area of the circle is " + result);
        result = AreaCalculator.area(-1.0, 4.0);
        System.out.println("The area of the circle is " + result);

    }
}
