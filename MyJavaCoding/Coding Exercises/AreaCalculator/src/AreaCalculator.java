public class AreaCalculator {
    private static final double PI = Math.PI;


    public static double area(double radius){
        if(radius < 1) return -1.0;

        return (PI * Math.pow(radius,2));
    }

    public static double area(double x, double y){
        if(x < 0 || y < 0) return -1.0;

        return (x * y);
    }

}

