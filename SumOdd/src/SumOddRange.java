public class SumOddRange {

    public static boolean isOdd(int number){

        if (number < 0){
            return false;
        }

        if (number % 2 != 0){
            return true;
        }else {
            return false;
        }
    }

    public static int sumOdd(int start, int end){

        if ((start <= 0) || (end <= 0) || (end < start)){
            return -1;
        }

        int oddSum = 0;
        for (int i = start; i <= end; i++){
            if(isOdd(i)){
                oddSum += i;
            }
        }
        System.out.println("The sum of the odd numbers from " + start + " to " + end + " is " + oddSum);
        return oddSum;
    }
}
