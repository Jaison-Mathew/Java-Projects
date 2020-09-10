public class TeenNumberChecker {

    public static boolean hasTeen(int person1, int person2, int person3){

        if (person1 >= 13 && person1 <= 19){
            return true;
        }else  if (person2 >= 13 && person2 <= 19){
            return true;
        }else  if (person3 >= 13 && person3 <= 19){
            return  true;
        }else {
            return false;
        }
    }

    public static boolean isTeen(int age){
        if (age >= 13 && age <= 19){
            return true;
        }else {
            return false;
        }
    }
}
