public class Main {

    public static void main(String[] args) {
        boolean result = BarkingDog.shouldWakeUp(true, 1);
        System.out.println(result);
        result = BarkingDog.shouldWakeUp(false, 2);
        System.out.println(result);
        result = BarkingDog.shouldWakeUp(true, 8);
        System.out.println(result);
        result = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(result);
    }
}
