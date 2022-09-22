public class MinutesToYearsDaysCalculator {
    private static final String ERROR_MSG = "Invalid Value";
    public static void printYearsAndDays(long minutes){
        if(minutes < 0) System.out.println(ERROR_MSG);

        long hours = minutes / 60;
        long noOfDays = hours / 24;

        long years = noOfDays / 365;
        long days = noOfDays % 365;

        System.out.println(minutes + " min = " + years + " y and " + days + " d");

    }
}
