import java.util.Scanner;

public class digitSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Sum = 0;
        while(n != 0){
            Sum += (n % 10);
            n = n / 10;
        }
        System.out.println(Sum);
    }
}
