public class NumberToWords {
    public static void main(String[] args) {

        numberToWords(10000);
    }

    public static int getDigitCount(int n){
        if(n<0) return -1;
        if(n==0) return 1;
        int count = 0;
        while(n != 0){
            count++;
            n = n/10;
        }
        return count;
    }

    public static int reverse(int n){
        int rev = 0;
        while(n != 0){
            rev = (rev * 10) + (n % 10);
            n = n/10;
        }
        return rev;
    }

    public static void numberToWords(int n){

        if(n < 0) System.out.println("Invalid Value");
        int count =getDigitCount(n);
        int rev = reverse(n);
        int digit = 0;
        for(int i = count; i>0; i--){
            digit = rev % 10;
            rev = rev / 10;
            if(digit == 0) System.out.println("Zero ");
            else if(digit == 1) System.out.println("One ");
            else if(digit == 2) System.out.println("Two ");
            else if(digit == 3) System.out.println("Three ");
            else if(digit == 4) System.out.println("Four ");
            else if(digit == 5) System.out.println("Five ");
            else if(digit == 6) System.out.println("Six ");
            else if(digit == 7) System.out.println("Seven ");
            else if(digit == 8) System.out.println("Eight ");
            else if(digit == 9) System.out.println("Nine ");
        }
    }

}
