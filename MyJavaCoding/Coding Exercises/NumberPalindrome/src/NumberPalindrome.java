public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(0));
    }

    public static boolean isPalindrome(int n){

        int p = n;
        int rev = 0;

        while(p != 0){
            rev=(rev * 10) + (p % 10);
            p = p/10;
        }
        if(rev == n) return true;
        else return false;
    }

}
