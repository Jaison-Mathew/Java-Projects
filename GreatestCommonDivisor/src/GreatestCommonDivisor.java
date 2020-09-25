public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second){

        if((first < 10) || (second < 10)){
            return -1;
        }

        int divisor1 = 0;
        for (int i = 1; i < first; i++){
            int firstDiv = first % i;
            int secondDiv = second % i;
            if (firstDiv == 0 && secondDiv == 0){
                divisor1 = i;
            }
        }
        return divisor1;
    }
}
