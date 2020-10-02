public class LargestPrime {

    public static int getLargestPrime(int number){

        //remove negative numbers
        if (number <= 1){
            return -1;
        }

        int i = 2;

        //create loop to see if number is divisible to i
        for (; i <= number; i++){
            if (number % i == 0){
                //number is divided by i to find the largest factor
                number /= i;
                i--;        //Subtracts number by 1 to get prime factor
            }
        }
        return i;
    }
}
