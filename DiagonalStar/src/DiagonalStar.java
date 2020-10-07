public class DiagonalStar {

    public static void printSquareStar(int number){

        if (number < 5){
            System.out.println("Invalid Value");
        }else {
            //create for loop for rows
            for(int i = 1; i <= number; i++){
                //create for loop for columns
                for (int j = 1; j <= number; j++){
                    //Create boundaries for square
                    if (i == 1 || j == 1 || i == j || i == number ||  j == number || j == (number - i + 1)){
                        System.out.print("*");      //used to print "*" on the same line
                    }else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        }

    }
}
