public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        int c = (int)(a * 1000);
        int d = (int)(b * 1000);
        if(c == d) return true;
        else return false;
    }

}
