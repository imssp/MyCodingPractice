public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(2,26));
    }

    public static boolean hasSharedDigit(int a, int b){

        if(a < 10 || b < 10 || a > 99 || b > 99) return false;
        for(int i = 0; i < 10; i++){
            if((i==a%10 || i==a/10) && ((i==b%10 || i==b/10)))
                return true;
        }

        return false;

    }

}
