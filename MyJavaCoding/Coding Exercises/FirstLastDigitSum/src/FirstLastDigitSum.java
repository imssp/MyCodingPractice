public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(26428736));
    }

    public static int sumFirstAndLastDigit(int n){
        if(n < 0) return -1;
        int lastDigit = n % 10;
        int firstDigit = 0;
        while(n != 0){
            firstDigit = n % 10;
            n = n / 10;
        }
        return (lastDigit + firstDigit);
    }

}
