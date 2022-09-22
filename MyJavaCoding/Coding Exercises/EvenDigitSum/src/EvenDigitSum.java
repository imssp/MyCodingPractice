public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(0));
    }

    public static int getEvenDigitSum(int n){
        if(n < 0) return -1;
        int sum = 0;
        while(n != 0){
            if((n % 10) % 2 == 0){
                sum += (n % 10);
            }
            n = n / 10;
        }
        return sum;
    }

}
