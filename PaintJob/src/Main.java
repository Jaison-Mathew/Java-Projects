public class Main {

    public static void main(String[] args) {

        int result = PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2);
        System.out.println(result);
        result = PaintJob.getBucketCount(3.4, 2.1, 1.5, 2);
        System.out.println(result);
        result = PaintJob.getBucketCount(2.75, 3.25, 2.5, 1);
        System.out.println(result);

        int result2 = PaintJob.getBucketCount(-3.4, 2.1, 1.5);
        System.out.println(result2);
        result2 = PaintJob.getBucketCount(3.4, 2.1, 1.5);
        System.out.println(result2);
        result2 = PaintJob.getBucketCount(7.25, 4.3, 2.35);
        System.out.println(result2);

        int result3 = PaintJob.getBucketCount(3.4, 1.5);
        System.out.println(result3);
        result3 = PaintJob.getBucketCount(6.26, 2.2);
        System.out.println(result3);
        result3 = PaintJob.getBucketCount(3.26, 0.75);
        System.out.println(result3);


    }
}
