//Using the Java language, have the function TimeConvert(num) take the num parameter being passed
// and return the number of hours and minutes the parameter converts to (ie. if num = 63 then the output should be 1:3).
// Separate the number of hours and minutes with a colon.

public class TimeConvertChallenge {

    public static void main(String[] args) {
        System.out.println(TimeConvert(63));
    }

    static String TimeConvert(int num) {
        int reminder;
        int hour;

        hour = num / 60;
        reminder = num % 60;

        return hour + ":" + reminder;
    }

}
