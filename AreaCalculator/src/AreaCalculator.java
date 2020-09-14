public class AreaCalculator {

    public static double area(double radius){
        if (radius < 0){
            return -1.0;
        }else {
            return radius * radius * Math.PI;
        }
    }

    public static double area(double sideX, double sideY){
        if (sideX < 0 || sideY < 0){
            return -1.0;
        }else{
            return sideX * sideY;
        }
    }
}
