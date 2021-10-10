import java.util.Calendar;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println(isLeapYearMethod1(2000));
        isLeapYearMethod2(2003);
        isLeapYearMethod2(2004);
    }

    // logic - year is leap when it's devided by 400 or it's devided by 4, but not by 100
    static boolean isLeapYearMethod1(int year) {
        return (year%400 == 0) || (year%100) != 0 && (year % 4 == 0);
    }

    static void isLeapYearMethod2(int year) {
        // getting calendar
        Calendar calendar = Calendar.getInstance();
        // setting year
        calendar.set(Calendar.YEAR, year);
        int numberOfDays = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);

        if(numberOfDays > 365) {
            System.out.println(year + " is leap year.");
        } else {
            System.out.println(year + " is not leap year.");
        }
    }
}
