public class sum3and5 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for(int i=1; i<=1000; i++ ){

            if(count == 5){
                break;
            }

            else if( (i % 3 == 0) && (i % 5 == 0) ){
                sum= sum + i;
                System.out.println(i);
                count++;
            }
        }
        System.out.println(sum);

    }
}
