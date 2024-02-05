package Task121;

public class MyDate {
    public static void main(String[] args) {
        // Set the date for date1 to January 1st of 1978
        DateTask date1 = new DateTask();
        date1.setDate(1, 1, 1978);

        // Set the date for date2 to September 21st of 1984
        DateTask date2 = new DateTask();
        date2.setDate(9, 21, 1984);

        System.out.println(date1.toString());
        System.out.println(date2.toString());

        // Display DateTask leapYears after printing date2
        DateTask.leapYears();
    }
}
