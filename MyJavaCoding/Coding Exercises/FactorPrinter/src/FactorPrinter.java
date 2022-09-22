public class FactorPrinter {
    public static void main(String[] args) {
        printFactors(10);
    }

    public static void printFactors(int n){
        if(n < 1) System.out.println("Invalid Value");

        for(int i = 1; i <= n; i++){
            if(n%i == 0) System.out.println(i);
        }
    }

}
