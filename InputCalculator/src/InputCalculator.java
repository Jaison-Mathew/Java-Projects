import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;

        while (true) {
            //System.out.println("Enter a number: ");
            boolean hasNum = scanner.hasNextInt();
            if (hasNum) {

                int number = scanner.nextInt();
                sum += number;
                counter++;
                scanner.nextLine();     //handles next line (enter key)

            }
            else {
                break;
            }
        }

        if (counter == 0){      //if the first input wasn't a number, the sum and average will be 0
            System.out.println("SUM = 0 AVG = 0");
        }else{
            long average = (sum / counter);
            System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
        }

        scanner.close();
    }
}
