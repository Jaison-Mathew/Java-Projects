public class FactorPrinter {

    public static void printFactors(int number){

        if (number < 1){
            System.out.println("Invalid Value");
        }

        String factorLine = "";
        for (int i = 1; i <= number; i++) {
            int factor = number % i;
            if (factor == 0) {
                factorLine += i + " ";
            }
        }
        System.out.println(factorLine);
    }
}
