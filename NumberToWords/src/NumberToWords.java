public class NumberToWords {
    public static void numberToWords(int input) {

        //If the number is equal to zer, output will be "Zero"
        if (input == 0){
            System.out.println("Zero");
        }else if (input < 0){
            System.out.println("Invalid Value");
        }

        //
        // Reverse number, input 100, output 1
        final int revNumber = reverse(input);
        //Loop through digits, one loop with 1
        int rNum = revNumber;
        int newNum = 0;
        while (rNum > 0){
            int lastDigit = rNum % 10;
            newNum *= 10;
            newNum += lastDigit;
            rNum /= 10;
        }
        //Loop through each digit of reverse number, expect "One"
        int revDigit = revNumber;
        while (revDigit > 0){
            int lDigit = revDigit % 10;
            //Printing digits as words, print just one
            switch (lDigit){
                case 0:
                    System.out.print("Zero ");
                    break;

                case 1:
                    System.out.print("One ");
                    break;

                case 2:
                    System.out.print("Two ");
                    break;

                case 3:
                    System.out.print("Three ");

                    break;

                case 4:
                    System.out.print("Four ");
                    break;

                case 5:
                    System.out.print("Five ");
                    break;

                case 6:
                    System.out.print("Six ");
                    break;

                case 7:
                    System.out.print("Seven ");
                    break;

                case 8:
                    System.out.print("Eight ");
                    break;

                case 9:
                    System.out.print("Nine ");
                    break;

                default:
                    System.out.print("Error ");
            }
            revDigit /= 10;
        }


        // print remaining zeroes, output "Zero Zero"
        int digitCountDifference = getDigitCount(input) - getDigitCount(revNumber);
        for (int i =0; i < digitCountDifference; i++){
            System.out.print("Zero ");
        }
        System.out.println("\n");
    }


    public static int reverse(int number){

        boolean isNegative = number < 0;
        if (isNegative){
            number *= -1;
        }

        int count = 0;
        int reverseNum = 0;
        while (number > 0){
            int lastDigit = number % 10;
            reverseNum *= 10;
            reverseNum += lastDigit;
            number /= 10;
            count++;
        }

        if (isNegative == true){
            return reverseNum *= -1;
        }else{
            return reverseNum;
        }

    }

    public static int getDigitCount(int number){

        if (number < 0){
            return -1;
        }else if (number == 0){
            return 1;
        }

        int digitSum = 0;

        while (number > 0){

            number /= 10;
            digitSum++;
        }

        return digitSum;
    }
}
