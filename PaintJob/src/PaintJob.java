public class PaintJob {

    //function to find the number of remaining buckets needed to fill wall area
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }

        double wallArea = width * height;
        double buckets = areaPerBucket * extraBuckets;
        double counter = 0;
        for(double i = buckets; i < wallArea; i += areaPerBucket){
            //loop counts the remaining buckets needed to fill wallarea
            counter++;
        }

        return (int) counter;
    }

    //function to find the number of buckets needed to buy
    public static int getBucketCount(double width, double height, double areaPerBucket){

        if (width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }

        double wallArea = width * height;
        double bucketCounter = 0;
        for (double i = 0; i <= wallArea; i += areaPerBucket){
            bucketCounter++;
        }

        return (int) bucketCounter;
    }

    //function to find number of buckets needed to fill wall area without knowing width or height
    public static int getBucketCount(double area, double areaPerBucket){

        if (area <= 0 || areaPerBucket <= 0){
            return -1;
        }

        double bucketCounter = 0;
        for (double i = 0; i <= area; i += areaPerBucket){
            bucketCounter++;
        }

        return (int) bucketCounter;
    }
}
