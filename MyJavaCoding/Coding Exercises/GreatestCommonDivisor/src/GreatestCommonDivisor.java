public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
    }

    public static int getGreatestCommonDivisor(int a, int b){
        if(a < 10 || b < 10) return -1;

        for(int i = Math.min(a,b); i>1; i-- ) {
            if (a % i == 0 && b % i == 0) return i;
        }

        return -1;

    }

}
