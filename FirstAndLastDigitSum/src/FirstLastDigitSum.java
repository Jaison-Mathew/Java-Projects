public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){

        if (number < 0){
            return -1;
        }else if (number < 10){
            return number * 2;
        }

        //Finding last digit
        int lastDigit = number % 10;

        //while loop removes last digits until there is one digit left
        while(number >= 10){
            number = number / 10;

        }
        int sum = number + lastDigit;

        return sum;

    }
}
