package Week4;

import java.util.GregorianCalendar;

public class Pro2_64010845 {
    public static void main(String[] args) {
        GregorianCalendar date = new GregorianCalendar();
        System.out.println("Current year, month, date, and day of week");
        System.out.println("Year is " + date.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + date.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + date.get(GregorianCalendar.DATE));
        System.out.println("Day of week is " + date.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println("After specified the elapsed time of one day after current day");
        date.add(GregorianCalendar.DATE, 1);
        System.out.println("Year is " + date.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + date.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + date.get(GregorianCalendar.DATE));
        System.out.println("Day of week is " + date.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println(date.getTime());
    }
}
