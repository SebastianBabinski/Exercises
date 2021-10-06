public class ArmstrongNumber {

    public static void main(String[] args) {
        isArmstrongNumber(153);
        isArmstrongNumber(1634);
        isArmstrongNumber(54748);
        isArmstrongNumber(548834);
        isArmstrongNumber(5516);
    }

    static void isArmstrongNumber(int number) {
        // converting number to string to get the power of
        String numberString = String.valueOf(number);
        int result = 0;
        int toThePowerNumber = 0;

        for (int i = 0; i < numberString.length(); i++) {
            // taking char from String, converting it to numeric value
            toThePowerNumber = Character.getNumericValue(numberString.charAt(i));
            // adding the power of numeric value to the result
            result = (int) (result + Math.pow(toThePowerNumber, numberString.length()));
        }

        if (result == number) {
            System.out.println(number + " is an armstrong number.");
        } else {
            System.err.println(number + " is not armstrong number");
        }
    }

}
