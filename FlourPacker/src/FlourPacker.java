public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal){

        //Removing negative numbers
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)){
            return false;
        }

        int bigFlour = bigCount * 5;
        int sum = bigFlour + smallCount;



        //use if statement to determine if sum is equal to goal
        if (sum == goal){
            return true;
        }else{
            if(sum > goal && smallCount >= goal%5){
                //returns true if smallCount is greater or equal than mod of goal and 5
                return true;
            }else if (bigCount == 0 && smallCount >= goal){
                //returns true if there is no bigCount amount and the smallCount is greater than the goal amount.
                return true;
            }else {
                return false;
            }
        }

    }
}
